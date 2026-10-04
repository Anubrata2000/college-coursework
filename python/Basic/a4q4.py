c=0
str=input("Enter a string: ")
for i in str:
    if(i==' '):
        continue
    else:
         c+=1
print("Length of the string avoiding spaces is:",c)