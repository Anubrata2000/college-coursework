declare -a arr
echo "How many elements?"
read n
i=0
s=0
echo "Enter the elements"
while [ $i -lt $n ]
do
read arr[$i]
s=`expr $s + ${arr [$i]}`
i=`expr $i + 1`
done
echo "Sum=$s"

