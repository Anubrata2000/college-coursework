echo "Armstrong nos between 100 and 999= "
for i in $(seq 100 999 )
do
s=0
n=$i
while [ $n -gt 0 ]
do
d=`expr $n % 10`
s=`expr "$s + $d ^ 3" | bc`
n=`expr $n / 10`
done
if [ $s -eq $i ]
then
echo -n "$i "
fi
done
