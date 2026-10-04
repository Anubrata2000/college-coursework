ch='y'
x,y,z=0,0,0
while ch=='y':
    num=int(input("Enter any integer"))
    if (num>0):
         print("Positve integer")
         x+=1
    elif (num==0):
        print("Number entered is zero")
        y+=1
    else:
        print("Negative numbers")
        z+=1
print("DO YOU WANT TO CONTINUE")
ch=input("enter 'y' to continue and any other character to exit")
print("NUMBER OF POSITIVE INTEGERS",x,"NUMBER OF ZEROS",y,"NUMBER OF NEGATIVE NUMBERS",z)
print("PROGRAM OVER")
