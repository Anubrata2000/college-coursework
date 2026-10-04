i=0 
sum=0
while(i<=9):
    hours=int(input("Enter the hours worked: "))
    if(hours>40):
        overhours=hours-40
        overtime=overhours*12
        print("Overtime Rs.:",overtime)
    i+=1    
    sum+=overtime   
print("Total overtime of 10 employees is Rs.:",sum)    