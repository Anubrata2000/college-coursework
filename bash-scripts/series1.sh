read -p "No. of terms=" n
s=0
c=1;i=1
while [ $c -le $n ]
do
c=`expr $c + 1`
s=`echo "$s + ($i ^ 2)" | bc`
i=`expr $i + $c`
done
echo "Sum of $n terms=$s"
