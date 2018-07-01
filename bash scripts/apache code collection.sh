

[debian.linuxnix] root:~/ # service apache2 status
[centos.linuxnix] root:~ # apachectl status


When you modify your vhosts configurations you can check syntax by using commands below:

[debian.linuxnix] root:~/ # apache2ctl configtest
Syntax OK
[debian.linuxnix] root:~/ # apache2ctl -t
Syntax OK


Now, to list all running vhosts, you can use :

[debian.linuxnix] root:~/ # apache2ctl -S
VirtualHost configuration:




You can see that :

There are 4 loaded vhosts listening on port 8080.
The default vhost is also listening on port 443 for HTTPS.
On Centos we can use:

[centos.linuxnix] root:~ # apachectl -S
VirtualHost configuration:
*:80                   localhost (/etc/httpd/conf.d/s9s.conf:1)
*:443                  cc.severalnines.local (/etc/httpd/conf.d/ssl.conf:2)


service httpd start
/etc/init.d/httpd start
/usr/sbin/apachectl start
iptables -I INPUT -p tcp --dport 80 -j ACCEPT

open SuSE
mkdir /srv/www/htdocs/example

vi /etc/apache2/conf.d/example.conf



NameVirtualHost *:80

<VirtualHost 192.168.0.108:80>

ServerAdmin webmaster@example1.com

DocumentRoot /var/www/html/example1.com      

ServerName www.example1.com

</VirtualHost>

<VirtualHost 192.168.0.108:80>

ServerAdmin admin@example2.com

DocumentRoot /var/www/html/example2.com

ServerName www.example2.com

</VirtualHost>



#switch case
unameOut="$(uname -s)"
case "${unameOut}" in
    Linux*)     machine=Linux;;
    Darwin*)    machine=Mac;;
    CYGWIN*)    machine=Cygwin;;
    MINGW*)     machine=MinGw;;
    *)          machine="UNKNOWN:${unameOut}"
esac
echo ${machine}



sudo systemctl start httpd


gnome-terminal -e command
x-terminal-emulator



#creating log 




#!/bin/bash
#
LOGFILE=/home/test/test.log

echo "$(date "+%m%d%Y %T") : Starting work" >> $LOGFILE 2>&1   <=-=-=-=<
#
service test stop >> $LOGFILE
#
mv /var/run/test/test.pid /var/run/test/test.pid.bak
#
echo "`date +%H:%M:%S : process file moved" >> $LOGFILE
#
service test start >> $LOGFILE
#
echo "`date +%H:%M:%S : Finished" >> $LOGFILE



while true
do
    read -r -p $'What is the JIRA Ticket associated with this work?' JIRA
    [[ $JIRA == [0-9][0-9][0-9][0-9] ]] && break 1
    echo -en "The JIRA Ticket should only be 4 digits\nPlease try again."
done


if [[ -e /etc/iptables/rules.v4 || -d /etc/sysconfig/iptables || -f /etc/iptables/iptables.rules || /etc/sysconfig/iptables-config ]]
then 
#installed
    echo -e "${PURPLE}IPTABLES FOUND"
    systemctl status iptables

else

echo -e "${PURPLE}IPTABLES NOT FOUND"
echo -e "${RED}You can only use iptables with this option 
Do you want to install it ?
NOTE:- This will disable your current firewall settings"
read -p "Continue ? { yes | no }" FIRE_INSTALL

if [ $FIRE_INSTALL == "yes" ]
then

else

fi



systemctl disable firewalld
    systemctl stop firewalld
    yum install -y iptables
    yum install iptables-services -y
    systemctl enable iptables
    systemctl start iptables

iptables --version 


IncludeOptional sites-enabled/*.conf


firewall-cmd --permanent --add-port=80/tcp        
firewall-cmd --permanent --add-port=443/tcp
firewall-cmd --reload
        NameVirtualHost *:80

<VirtualHost *:80>
    ServerAdmin webmaster@example.com
    ServerName example.com
    ServerAlias www.example.com
    DocumentRoot /var/www/html/example.com/public_html/
    ErrorLog /var/www/html/example.com/logs/error.log
    CustomLog /var/www/html/example.com/logs/access.log combined
</VirtualHost>



#!bin/bash
# Enable a site, just like the a2ensite command.

SITES_AVAILABLE_CONFIG_DIR="/etc/httpd/sites-available/";
SITES_ENABLED_CONFIG_DIR="/etc/httpd/sites-enabled";

function a2ensite()
if [ $1 ]; then
  if [ -f "${SITES_ENABLED_CONFIG_DIR}${1}" ]; then
    echo "Site ${1} was already enabled!";
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
function a2disite()
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
