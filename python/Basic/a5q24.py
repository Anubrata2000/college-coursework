l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
for i in l1:
    if i % 2 != 0:
        l1.remove(i)
print("Updated list with no odd numbers are: ",l1)        