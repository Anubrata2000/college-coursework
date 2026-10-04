big()
{
p=$1
q=$2
r=$3
if [ $p -gt $q -a $p -gt $r ]
then
return $p
elif [ $q -gt $p -a $q -gt $r ]
then
return $q
else
return $r
fi
}
main()
{
read -p "Enter any three nos." a b c
big $a $b $c
echo "the largest no is $?"
}
main
