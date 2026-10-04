y = float(input("Enter a base: "))
x = int(input("Enter a exponent: "))

prod = 1

for i in range(x):
    prod *= y

print("The value is:", prod)