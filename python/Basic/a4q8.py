str=input("Enter a string: ")
i,nc,nd=0,0,0
while(i<len(str)):
    a=ord(str[i])
    if a>=97 and a<=122:
        #print(a)
        nc+=1
        #print(nc)
    if a>=48 and a<=57:
        #print(a)
        nd+=1
    if nc>=1 and nd>=1:
        #print(nd,nc)
        break
    i+=1
if (nc>=1 and nd>=1):
    print("letters and digits found")
else:
    print("Not found")