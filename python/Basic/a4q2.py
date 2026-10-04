
'''n=int(input())
dec=0
pow=1
while n>0:
    rem=n%10
    n//=10
    dec+=rem*pow
    pow*=2
print(dec)'''

b_num = list(input("Input a binary number: "))
value = 0

for i in range(len(b_num)):
	digit = b_num.pop()
	if digit == '1':
		value = value + pow(2, i)
print("The decimal value of the number is", value)
