#!/usr/bin/bash
NUM=5
target=$(($RANDOM % $NUM)) 

read -p "Guess the number between 1 to 5 =" guess
 if [[ ${guess} = ${target} ]];then
    echo "Correc.t you won!!"
    else
     echo "try again"
     fi
     