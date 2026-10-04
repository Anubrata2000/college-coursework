read -p "No. of terms= " n
c=3;s=0
for i in $(seq 1 $n)
do
s=`echo "$s + $i * ($c ^ 2)"| bc`
c=`expr $c + 2`
done
echo "Sum of $n terms=$s"
