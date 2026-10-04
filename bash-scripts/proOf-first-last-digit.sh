read -p "Enter the no. to find the product of its first and last digit= " n
p=o;f=0;l=0
while [ $n -ge 10 ]
do
f=`expr $n / 10`
done
l=`expr $n % 10`
p=`expr $f \* $l`
echo "Product of first and last digit of $n is= $p"
