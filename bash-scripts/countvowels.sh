read -p "enter a string= " s
n=`echo ${#s}`
i=0;c=0;d=0
while [ $i -lt $n ]
do
a=`echo ${s:$i:1}`
case $a in
"a"|"e"|"i"|"o"|"u")
c=`expr $c + 1`
;;
' ')
d=`expr $d + 1`
echo $d
;;
esac
i=`expr $i + 1`
done
echo "$c"
cn=`echo "$n-$c-$d" | bc`
echo "consonants = $cn"
