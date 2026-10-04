read -p "enter your name: " name
r=""
for i in $name
do
r="$r${i:0:1}."
done
echo $r
