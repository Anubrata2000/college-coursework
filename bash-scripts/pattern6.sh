read -p "Enter no. of lines= " n
for i in $(seq 1 $n)
do
for k in $(seq 1 $i)
do
echo -n " "
done
for j in $(seq $i $n)
do
echo -n "* "
done
echo;
done
