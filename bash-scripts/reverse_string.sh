read -p "enter any string= " s
n=`echo ${#s}`
n=`expr $n - 1`
for i in $(seq $n -1 0 )
do
a="echo ${s:$i:1}"
echo -n $a
done
echo;

