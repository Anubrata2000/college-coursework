lcm()
{
for i in $(seq 1 `expr $1 \* $2` )
do
if [ `expr $i % $1` -eq 0 -a `expr $i % $2` -eq 0 ]
then
return $i
fi
done
}
main()
{
read -p "Enter 2 numbers = " a b
lcm $a $b
echo "LCM of $a,$b=$?"
}
main
