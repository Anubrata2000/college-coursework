d=int(input("Enter a five digit number: "))
rev=0
while(d!=0): 
      temp=(d%10)
      rev=(rev*10)+temp
      d=d//10
print("Reverse=",rev) 
