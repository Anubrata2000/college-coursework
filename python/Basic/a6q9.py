  
def hcf(a, b):
    if(b == 0):
        return a
    else:
        return hcf(b, a % b)
  
a = int(input("Enter a number: "))
b = int(input("Enter a number: "))
  
# prints 12
print("The gcd of ",a," and ",b," is : ", end="")
print(hcf(a,b))