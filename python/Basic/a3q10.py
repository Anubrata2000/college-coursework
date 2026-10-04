how = int (input("Enter how many number you want to enter: "))
num = int(input("Enter the number :"))
maximum = minimum = num
for i in range(1,how):
    num = int(input("Enter the number :"))
    if(num>maximum):
        maximum = num
    if(num<minimum):
        minimum = num
r = maximum-minimum
print("Range is:",r)
