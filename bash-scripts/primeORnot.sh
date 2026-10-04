read -p "enter a no: " n
c=0
for i in $(seq 2 `expr $n / 2`)
do
if [ `expr $n % $i` -eq 0 ]
then
c=`expr $c + 1`
fi
done
if [ $c -eq 0 ]
then
echo "$n is a prime number"
else
echo "$n is not a prime number"
fi
