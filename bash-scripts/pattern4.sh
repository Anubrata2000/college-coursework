read -p "Enter no. of lines= " n
for i in $(seq 1 1 $n)
do
x=`expr $n - $i`
for j in $(seq 1 1 $x)
do
echo -n " "
done
for k in $(seq 1 1 $i)
do
echo -n "$k"
done
echo ""
done
