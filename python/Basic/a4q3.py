str=input("Enter a string: ")
a=int(input("Enter the ith character you wqnt to remove: "))
b=str[0:a]
c=str[a+1: ]
str=b+c
print("new String: ",str)