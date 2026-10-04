read -p "Number of elements to enter( Min=2 )= " n
declare -a arr
for i in $(seq 1 $n )
do
read -p "Enter a number= " arr[$i]
done
for i in $(seq 1 `expr $n - 1` )
do
for j in $(seq `expr $i + 1` $n )
do
if [ ${arr[$i]} -ge ${arr[$j]} ]
then
l=${arr[$i]}
s=${arr[$j]}
else
l=${arr[$j]}
s=${arr[$i]}
fi
p=1
k=2
while [ $k -le $l -o $k -le $s ]
do
if [ `expr $l % $k` -eq 0 -a $l -ne 0 -o `expr $s % $k` -eq 0 -a $s -ne 0 ] #checking for factors
then
p=`expr $p \* $k`
if [ `expr $l % $k` -eq 0 ] #divide l if it's divisible by k
then
l=`expr $l / $k`
fi
if [ `expr $s % $k` -eq 0 ] #divide s if it's divisible by k
then
s=`expr $s / $k`
fi
else # k+1 for next factor
k=`expr $k + 1`
fi
done
echo "LCM of ${arr[$i]} and ${arr[$j]} = $p"
done
done
