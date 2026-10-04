str=input("Enter a string:")
l=len(str)
if(l%2==0):
    a=str[:int(l/2)]
    b=str[int(l/2):]
else:
    a=str[:int(l/2)+1]
    b=str[int(l/2)+1:]
res=a.upper()+b
print(res)