c=0
read -p "enter any name= " name
l=`echo ${#name}`
for i in $(seq 1 1 $l)
do
echo ${name:0:$i}
done
