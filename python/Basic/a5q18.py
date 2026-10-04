l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
l2=list()
for i in l1:
    if i not in l2:
        l2.append(i)
print("Updated list without duplicate numbers:",l2)        