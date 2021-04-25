#!/usr/bin/bash

echo "Enter your first name:" $FIRSTNAME
read FIRSTNAME
echo "Enter your last name:" $LASTNAME
read LASTNAME
echo "Enter your age:" $USERAGE
read USERAGE
a=$(( $USERAGE + 10 ))
echo  "hello" $FIRSTNAME $LASTNAME "you are " $USERAGE "years old" ":)" "your age after 10 years is " $a