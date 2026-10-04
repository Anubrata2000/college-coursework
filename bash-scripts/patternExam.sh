read -p "How many rows: " n
for i in $(seq 1 1 $n)
do
  tmp=`expr $n - $i`
  for j in $(seq 1 1 $tmp)
  do
    echo -n " "
  done
  
  for k in $(seq 1 1 $i)
  do
    echo -n " $k"
  done
  echo
done
