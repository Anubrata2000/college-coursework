declare -a arr
echo "How many elements?"
read n
s=0;i=0
echo "enter the elements"
while [ $i -lt $n ]
do
read arr[$i]
s=`expr $s + ${arr[$i]}`
i=`expr $i + 1`
done
echo "sum=$s"


