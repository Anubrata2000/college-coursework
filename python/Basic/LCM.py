def LCM(n1,n2):
    if n1>n2:
        higher=n1
    else:
        higher=n2
    val=higher
    while(True):
        if higher%n1==0 and higher%n2==0:
            return(higher)
            break
        else:
            higher+=val
    
    
n1=int(input("Enter a number: "))
n2=int(input("Enter another number: "))    
print("LCM of the above two numbers are:",LCM(n1,n2))