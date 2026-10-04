sum()
{
x=$1
y=$2
z=`expr $x + $y`
return $z
}
read -p "Enter two nos. " a b
sum $a $b
c=$?
echo "Summation=$c"
