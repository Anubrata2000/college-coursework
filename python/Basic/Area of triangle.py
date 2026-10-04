height = int(input("Enter the height of the triangle: "))
base = int(input("Enter the base of the triangle: "))
Area = 0
if ((height == 0) or (base == 0)):
      print("It is not a triangle. Enter values again.")
else:
     Area = ((height*base)/2)
     print("Area of triangle= ",Area)    