d=int(input("Enter a five digit number: "))
sum = 0
while(d!=0): 
      temp=(d%10)
      sum=sum+temp
      d=d//10
print("Sum=",sum) 
