read -p "Enter the no. to check perfect square= " n
i=1;x=0;v=0
while [ $i -le $n ]
do
x=`expr $i \* $i`
if [ "$x" = "$n" ]
then
v=1
echo "The number is a perfect square "
fi
i=`expr $i + 1`
done
if [ $v -eq 0 ]
then
echo "The number is not a perfect square"
fi
