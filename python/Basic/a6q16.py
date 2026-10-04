def countcase():
    cupper,clower=0,0
    str1=input("Enter a string: ")
    for i in str1:
        if ord(i)>=65 and ord(i)<=90:
            cupper+=1
        if ord(i)>=97 and ord(i)<=122:
            clower+=1
    print("Number of upper case letters are : ",cupper)          
    print("Number of lower case letters are : ",clower)
    
countcase()