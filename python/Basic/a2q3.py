h=int(input("Enter hardness of steel: "))
c=float(input("Enter carbon content of the steel: "))
t=int(input("Enter tensile strength of the steel: "))
if (h>50 and c<0.7 and t>5600):
      print(" Grade 10 ")
elif(h>50 and c<0.7 and t<=5600):
      print(" Grade 9 ")
elif(h<=50 and c<0.7 and t>5600):
      print(" Grade 8 ")
elif(h>50 and c>=0.7 and t>5600):
      print(" Grade 7 ")
elif(h>50 or c>=0.7 or t>5600):
      print(" Grade 6 ")
else:
      print("Grade 5")
