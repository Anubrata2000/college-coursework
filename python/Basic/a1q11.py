n=int(input("Enter a five digit number:"))
new = 0
while n!=0:
   new = new*10 + (n%10 + 1)%10
   n = n//10

n = 0 
while new>0 :
    n = n*10+new%10
    new = new//10
print(f'the new number is : {n}')