def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)
n=int(input("Input a number to compute the factorial : "))
if n>=0:
    print(factorial(n))
else:
    print("Enter positive number again.")    