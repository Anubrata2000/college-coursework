read -p "Enter no of lines:" n
for i in $(seq 1 $n)
do
for j in $(seq 1 $i)
do
if [ `echo "scale=0;($i + $j) % 2" |bc` -eq 0 ]
then
echo -n "1"
else 
echo -n "0"
fi
done
echo;
done
