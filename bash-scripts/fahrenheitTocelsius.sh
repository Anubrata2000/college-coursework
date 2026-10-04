fahrenheit=0
celsius=0
read -p "enter degree celsius temperature:" celsius
fahrenheit=`expr $celsius \* 9 / 5 + 32`
echo "$celsius degree celsius is equal to $fahrenheit degree fahrenheit"
