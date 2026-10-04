str=input("Enter a string: ")
c=0
for i in str:
     if(ord(i)>=48 and ord(i)<=57):
        c+=1
print("Frequency of numbers: ",c)        