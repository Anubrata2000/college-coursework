declare -a arr
read -p "Enter any no." n
i=0
while [ $n -gt 0 ]
do
arr[$i]=`expr $n % 2`
i=`expr $i + 1`
n=`expr $n / 2`
done
i=`expr $i - 1`
while [ $i -ge 0 ]
do
echo -n ${arr[$i]}
i=`expr $i - 1`
done
echo;

