read -p "Enter no. of lines:" n
c=1
for i in $(seq 1 $n)
do
x=`expr $n - $i`
for j in $(seq 1 $x)
do
echo -n " "
done
for k in $(seq 1 $i)
do
echo -n "$c"
c=`expr $c + 1`
done
echo ""
done
