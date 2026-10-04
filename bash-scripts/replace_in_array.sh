declare -a arr
read -p "how many elements?"
n=`expr $n - 1`
for i in $(seq 0 1 n)
do
read arr[$i]
done
read -p "which no. to replace" a
read -p "with what no." b
echo "array before replacement"
echo ${arr[@]}
echo ${arr[@]//$a/$b}
echo "array after replacement"
echo ${arr[@]}
