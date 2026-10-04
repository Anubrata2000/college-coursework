read -p "Enter a no.= " n
f=1
for i in $(seq 1 $n)
do
f=`expr $f \* $i`
done
echo "Factorial of $n=$f"
