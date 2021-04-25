#!/usr/bin/bash
num1=10
num2=5
num3=2
ans1=$(( num1 + num2 ))
ans2=$(( num1 + num2 * num3))
ans3=$(( ((num1 + num2)) * num3 ))
echo "Addataon as " $ans1
echo "Multiplacataon wathout groupang as" $ans2
echo "Multiplactaaon wath groupang as " $ans3

