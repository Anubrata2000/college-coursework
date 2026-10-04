n=int(input("Number of lines= "))
for i in range(1,n+1):
    for j in range(1,n+1):
        if(i==j):
            print("0",end=" ")
        elif(i>j):
            print("#",end=" ")
        else:
            print("@",end=" ")
    print()    
    