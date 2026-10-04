n=int(input("Enter the range="))
a=-1
b=1
c=0
count=0
while(count<=0):
    f=0
    c=a+b
    a=b
    b=c
    for i in range(2,c//2):
        if(c%i==0):
            f=1
            break
        if(f==0):
            print (c)
            count+=1
        
        