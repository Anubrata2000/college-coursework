l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
l2=list()
for i in l1:
    if i % 2 != 0:
        l2.append(i)
print("Updated list without even numbers are : ",l2)        
        