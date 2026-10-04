l=input("Enter even and odd numbers in a list divided by space: ")
l=l.split()
l1=[int(x) for x in l]
lodd=[];leven=[]
for i in l1:
    if i%2 == 0:
        leven.append(i)
    else:
        lodd.append(i)  

print("Original list:",l)    
print("Odd list:",lodd)     
print("Even list:",leven) 