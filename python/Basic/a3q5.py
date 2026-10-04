a = int(input("Enter the number:"))
x = a
sum = 0
while a!=0:
    rem = a%10
    sum =sum+(rem**3)
    a = a//10
if(sum==x):
    print(f'{x}is a Armstrong number')
else:
    print(f'{x}is not a Armstrong number')
