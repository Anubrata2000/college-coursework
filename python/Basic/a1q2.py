dist=float(input("Enter distance in km between two cities: "));
Inmeter=dist*1000
Infeet=dist*3280.84
Ininches=dist*39370.1
Incentimetre=dist*100000
print("Inmetres=",Inmeter)
print("Infeet=",Infeet)
print("Ininches=",Ininches)
print("Incentimetres=",Incentimetre)


maths=float(input("Enter marks for maths: "));
computerscience=float(input("Enter marks for computerscience: "));
physics=float(input("Enter marks for physics: "));
chemistry=float(input("Enter marks for chemistry: "));
biology=float(input("Enter marks for biology: "));
aggtmarks=(maths+computerscience+physics+chemistry+biology)/5
percentage=((maths+computerscience+physics+chemistry+biology)/500)*100
print("Aggregate marks obtained by student: ",aggtmarks)
print("Percentage obtained by student: ",percentage)


temp=float(input("Enter temperature of a city in fahrenheit: "))
celsius=(temp - 32)*(5/9)
if(temp==-40):
               print("Celsius: ",temp)
else:
     print("Temperature of city in celsius: ",celsius)
