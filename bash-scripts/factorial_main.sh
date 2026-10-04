fact()
{
if [ $1 -gt 1 ]
then
i=`expr $1 - 1`
j=`fact $i`
k=`expr $1 \* $j`
echo $k
else
echo 1
fi
#f=1
#for i in $(seq 1 $1 )
#do
#f=`expr $f \* $i`
#done
#return $f
}
main()
{
read -p "Enter a number= " a
fact $a
echo "Factorial of $a=$?"
}
main
