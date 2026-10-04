read -p "Enter no. of lines= " n
for i in $(seq $n 1 1)
do
for j in $(seq $i -1 1)
do
echo -n "$j"
done
echo;
done
