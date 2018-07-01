#!/bin/bash

FILE=".scan_det.conf"


if [[ ! -e $FILE ] 
 then
    touch $FILE

fi

AVAIL_WLAN_CARD="$(ifconfig | cut -c1-8 | sort -u | grep w)"

SCAN= sudo airodump-ng ${AVAIL_WLAN_CARD} 

#read -p "Enter scanning time :" TIME

${SCAN} >> $FILE &
cat $FILE

sleep 40s

kill %1


#complete os detector code

        if [ -f /etc/redhat-release ] ; then
            DistroBasedOn='RedHat'
            DIST=`cat /etc/redhat-release |sed s/\ release.*//`
            PSUEDONAME=`cat /etc/redhat-release | sed s/.*\(// | sed s/\)//`
            REV=`cat /etc/redhat-release | sed s/.*release\ // | sed s/\ .*//`
        elif [ -f /etc/SuSE-release ] ; then
            DistroBasedOn='SuSe'
            PSUEDONAME=`cat /etc/SuSE-release | tr "\n" ' '| sed s/VERSION.*//`
            REV=`cat /etc/SuSE-release | tr "\n" ' ' | sed s/.*=\ //`
        elif [ -f /etc/mandrake-release ] ; then
            DistroBasedOn='Mandrake'
            PSUEDONAME=`cat /etc/mandrake-release | sed s/.*\(// | sed s/\)//`
            REV=`cat /etc/mandrake-release | sed s/.*release\ // | sed s/\ .*//`
        elif [ -f /etc/debian_version ] ; then
            DistroBasedOn='Debian'
            DIST=`cat /etc/lsb-release | grep '^DISTRIB_ID' | awk -F=  '{ print $2 }'`
            PSUEDONAME=`cat /etc/lsb-release | grep '^DISTRIB_CODENAME' | awk -F=  '{ print $2 }'`
            REV=`cat /etc/lsb-release | grep '^DISTRIB_RELEASE' | awk -F=  '{ print $2 }'`
        fi

FILE=".scan_det.conf"

if [[ ! -e $FILE ]] 
 then
    touch $FILE

fi


echo "Output of "$SCAN" is in "$FILE" "


#!/bin/bash
#sample script to start a program, permit it to run for a predefined amount of wallclock time, then kill it.  Specify time in seconds
#
progID="gmplayer"
$progID &
mypid=`eval ps ax|grep "$progID"|grep -iv "grep"| awk '{print $1}'`
echo "mypid $mypid"
maxtime="5"
mins=0
secs=0
killmins=5
startsecs=`eval date | awk '{print $4}'| awk -F\: '{print $3}'`
starthours=`eval date |awk '{print $4}'| awk -F\: '{print $1}'`
startmins=`eval date |awk '{print $4}'| awk -F\: '{print $2}'`
while [ $secs -lt $killmins ]; do
  cursecs=`eval date | awk '{print $4}'| awk -F\: '{print $3}'`
  curhours=`eval date |awk '{print $4}'| awk -F\: '{print $1}'`
  curmins=`eval date |awk '{print $4}'| awk -F\: '{print $2}'`
  secs=$(( (curhours-starthours)*3600 + (curmins-startmins)*60 - startsecs + cursecs ))
  sleep 1
done
kill "$mypid"



function os_type
{
case `uname` in
  Linux )
     LINUX=1
     which yum && { echo centos; return; }
     which zypper && { echo opensuse; return; }
     which apt-get && { echo debian; return; }
     ;;
  Darwin )
     DARWIN=1
     ;;
  * )
     # Handle AmgiaOS, CPM, and modified cable modems here.
     ;;
esac
}


if [ "$?" -eq 0 ]
then 
    echo ""
else 
    echo ""
fi

read -p "enter a valid mac addr " $MAC_ADDR

#	${ROUTER_MAC_ADDR}=${MAC_ADDR}
	#echo "${} and entered ${} are equal and valid"

if [ `echo $MAC_ADDR | egrep "^([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}$"`=${MAC_ADDR} ]
then
    echo "This email address looks fine: $email"
else
    echo "This email address is flawed: $email"
fi

MAC=`echo $MAC_ADDR | egrep "^([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}$"`
echo $MAC

[[ "$MAC_ADDRESS" = "^([a-fA-F0-9]{2}:){5}[a-fA-F0-9]{2}$" ]] && echo "valid" || echo "invalid"

until [[ "$MAC_ADDRESS" == "^([a-fA-F0-9]{2}:){5}[a-fA-F0-9]{2}$" ]]
do
     # if [ $number -ne 50 ]
     # then 
           echo "Wrong number; try again" 
           read number 
     # fi
done 


10
#NO='^[0-9]+$'
#if ! [[ $OPT =~ $NO ]] ; then
#echo "error: Not a number" >&2 
#LOOP=0
#break
#else
if [ $OPT -eq $OPT 2>/dev/null ]
then
     echo "$input is an integer"
else
    echo "$input is not an integer"
fi



sudo ss -lptn 'sport = :80'
State   Local Address:Port  Peer Address:Port              
LISTEN  127.0.0.1:80        *:*                users:(("nginx",pid=125004,fd=12))
LISTEN  ::1:80              :::*               users:(("nginx",pid=125004,fd=11))

sudo netstat -nlp | grep :80
tcp  0  0  0.0.0.0:80  0.0.0.0:*  LISTEN  125004/nginx
You can also use lsof:

$ sudo lsof -n -i :80 | grep LISTEN
nginx   125004 nginx    3u  IPv4   6645      0t0  TCP 0.0.0.0:80 (LISTEN)



-P INPUT DROP
-P FORWARD DROP
-P OUTPUT ACCEPT
-N ICMP
-N TCP
-N UDP
-A INPUT -m conntrack --ctstate RELATED,ESTABLISHED -j ACCEPT
-A INPUT -i lo -j ACCEPT
-A INPUT -m conntrack --ctstate INVALID -j DROP
-A INPUT -p udp -m conntrack --ctstate NEW -j UDP
-A INPUT -p tcp -m tcp --tcp-flags FIN,SYN,RST,ACK SYN -m conntrack --ctstate NEW -j TCP
-A INPUT -p icmp -m conntrack --ctstate NEW -j ICMP
-A INPUT -p udp -j REJECT --reject-with icmp-port-unreachable
-A INPUT -p tcp -j REJECT --reject-with tcp-reset
-A INPUT -j REJECT --reject-with icmp-proto-unreachable
-A TCP -p tcp -m tcp --dport 22 -j ACCEPT




#!bin/bash
# Enable a site, just like the a2ensite command.

SITES_AVAILABLE_CONFIG_DIR="/etc/httpd/sites-available";
SITES_ENABLED_CONFIG_DIR="/etc/httpd/sites-enabled";

if [ $1 ]; then
  if [ -f "${SITES_ENABLED_CONFIG_DIR}/${1}" ]; then
    echo "Site ${1} was already enabled!";
  elif [ ! -w $SITES_ENABLED_CONFIG_DIR ]; then
    echo "You don't have permission to do this. Try to run the command as root."
  elif [ -f "${SITES_AVAILABLE_CONFIG_DIR}/${1}" ]; then
    echo "Enabling site ${1}...";
    ln -s $SITES_AVAILABLE_CONFIG_DIR/$1 $SITES_ENABLED_CONFIG_DIR/$1
    echo "done!"
 else
   echo "Site not found!"
fi
else
  echo "Please, inform the name of the site to be enabled."
fi


#!bin/bash
# Disable a site, just like a2dissite command, from Apache2.

SITES_AVAILABLE_CONFIG_DIR="/etc/httpd/sites-available";
SITES_ENABLED_CONFIG_DIR="/etc/httpd/sites-enabled";

if [ $1 ]; then
  if [ ! -f "${SITES_ENABLED_CONFIG_DIR}/${1}" ]; then
    echo "Site ${1} was already disabled!";
  elif [ ! -w $SITES_ENABLED_CONFIG_DIR ]; then
    echo "You don't have permission to do this. Try to run the command as root."
  elif [ -f "${SITES_AVAILABLE_CONFIG_DIR}/${1}" ]; then
    echo "Disabling site ${1}...";
    unlink $SITES_ENABLED_CONFIG_DIR/$1
    echo "done!"
  else
    echo "Site not found!"
  fi
else
  echo "Please, inform the name of the site to be enabled."
fi
	
