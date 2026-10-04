decimal=int(input("Enter a decimal: "))
octal=0
ctr=0
temp=decimal #copying number

#computing octal using while loop
while(temp>0):
    octal+=((temp%8)*(10**ctr)) #stacking remainders
    temp=int(temp/8)  #updating dividend
    ctr+=1
    
print("Octal of {x} is: {y}".format(x=decimal,y=octal))    