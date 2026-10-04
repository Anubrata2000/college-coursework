def ComputeGCD(a,b):
    if b==0:
        return a
    else:
        return ComputeGCD(b,a%b)
    
num1=int(input("Enter a number:"))
num2=int(input("Enter another number:"))
print("The GCD of the above two numbers are:",ComputeGCD(num1,num2))
    