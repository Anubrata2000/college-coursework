read -p "How many lines= " n
while [ $i -le $n ]
do
j=1
while [ $j -le $i ]
do
echo -n "*"
j=`expr $j + 1`
done
echo " "
i=`expr $i + 1`
done
