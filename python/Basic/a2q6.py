side1=int(input("Enter first side of a triangle: "))
side2=int(input("Enter second side of a triangle: "))
side3=int(input("Enter third side of a triangle: "))
if (side1==side2 and side2==side3):
       print("It is a equilateral triangle")
elif (side1==side2 or side2==side3 or side3==side1):
       print("It is a isoceles triangle")
elif ((side1**2)==((side2**2)+(side3**2))):
       print("It is a right angled triangle") 
else:
       print("It is a scalene triangle")

