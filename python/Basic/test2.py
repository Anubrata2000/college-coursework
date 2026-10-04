a=int(input("Enter a eight digit number: "))
s,c=0,0
while a!=0:
    rem=a%10
    if(rem%2==0):
        s=s
    else:
        s=s+rem
        c+=1
    a=a//10    
avg=s/c
print("Average=",avg)        