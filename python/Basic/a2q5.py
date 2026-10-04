a=float(input("Enter one side of a triangle: "))
b=float(input("Enter second side of a triangle: "))
c=float(input("Enter third side of a triangle: "))
if (a+b>=c and b+c>=a and c+a>=b):
      print("Triangle is valid")
else:
      print("Triangle isn't valid")
