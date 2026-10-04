import math
f=0
n=int(input("Enter any number= "))
s=int(math.sqrt(n))
for i in range(2,s+1):
    if(n%i==0):
        f=1
        break
if(f==0):
    print(n,"is prime number")
else:
    print(n,"is not a prime number")
    