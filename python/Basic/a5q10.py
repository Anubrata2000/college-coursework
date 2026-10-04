l=input("Enter a list divided by spaces: ")
l=l.split()
l1=[int(x) for x in l]
print("String list to integer list: ",l1)
print(type(l1[0]))