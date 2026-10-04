def testrange(n):
    a=int(input("Enter the start of range:"))
    b=int(input("Enter the end of range:"))
    if n in range(a,b+1):
        print("The number is in range")
    else:
        print("The number out of range") 

testrange(15)        