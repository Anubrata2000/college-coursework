n=input("Enter a name=")
n1=" "+n
a=n1.find(" ")
while a!=-1:
    print(n1[a+1],".",end=" ")
    a=n1.find(" ",a+1)
    