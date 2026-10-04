echo -n "Prime numbers between 1 and 100 : "
for i in $(seq 1 100 )
do
s=0
for j in $(seq 2 `expr $i / 2` )
do
if [ `expr $i % $j` -eq 0 ]
then
s=`expr $s + 1`
fi
done
if [ $s -eq 0 ]
then
echo -n "$i  "
fi
done
echo;
