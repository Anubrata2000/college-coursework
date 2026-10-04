l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
l2=list();l3=list()
for i in l1:
    l2.append(i**2)
    l3.append(i**3)
print("Original list: ",l1)
print("Squared list: ",l2)
print("Cubed list: ",l3)
    