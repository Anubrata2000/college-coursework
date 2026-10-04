declare -a arr
ev=0;od=0
read -p "How many elements? " n
while [ $i -lt $n ]
do
read arr[$i]
x=`expr ${arr[$i]} % 2`
if [ $x -eq 0 ]
then
ev=`expr $ev + 1`
fi
i=`expr $n - $ev`
done
od=`expr $n - $ev`
echo "Even nos=$ev"
echo "Odd nos=$od"
