#for num in range(1,301):
  #if(num>1):
     #for i in range(2,(num//2)):
         #if(num%i)==0:
             #break
         #else:
            # print(num, end = '  ')



a=1
while(a<=300):
    c=0
    i=2
    while (i<=a/2):
        if(a%i==0):
            c=c+1
            break
        i=i+1
    if(c==0 and a!=1):
        print(a)
    a=a+1    