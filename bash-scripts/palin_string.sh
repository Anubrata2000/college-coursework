read -p "enter any string= " s
n=`echo ${#s}`
n=`expr $n - 1`
for i in $(seq $n -1 0)
do
a="echo ${s:$i:1}"
done
echo "Reversed string is= $a"
if [ $a = $s ]
then
echo "$s is a palindome string"
else
echo "$s is not a palindrome string"
fi


