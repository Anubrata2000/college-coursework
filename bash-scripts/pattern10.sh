read -p "Enter no. of terms= " n
s=0
for i in $(seq 1 $n)
do
if [ `expr $i % 2` -eq 0 ]
then
s=`expr $s - $i`
else
s=`expr $s + $i`
fi
done
echo "Sum of $n terms=$s"
