declare -a arr
read -p "enter any no" n
while [ $n -gt 0 ]
do
r=`expr $n % 2`
arr[$i]=$r
i=`expr $n + 1`
n=`expr $n / 2`
done
i=`expr $i - 1`
while [ $i -ge 0 ]
do
echo -n ${arr[$i]}
i=`expr $i - 1`
done
