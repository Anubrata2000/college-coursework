str1=input("Enter a string: ")
print("The original string is :",str1)
str2=[]
for i in str1:
    cnt=str1.count(i)
    if(cnt%2!=0):
        str2.append(i)
print("The odd frequency characters are :",str(str2))       
