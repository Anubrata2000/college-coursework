a=int(input("Enter the range= "))
b=int(input("Enter 2nd range= "))
if(a<b):
  a,b=b,a
for i in range(a,b+1):
    for j in range(1,11):
        print(i,"*",j,"=",i*j)
  
    