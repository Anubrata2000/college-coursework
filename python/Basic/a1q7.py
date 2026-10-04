n=int(input("Enter a four digit number: "))
l=n%10
while n>9:
    n=n//10
l+=n
print("Addition of the first and the last digit of the four digit number is:",l)
