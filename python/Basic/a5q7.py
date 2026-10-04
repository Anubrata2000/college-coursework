l=input("Enter a list of elements divided by space: ")
l=l.split()
l1=[int(x) for x in l]
a=int(input("Enter an element:"))
for i in l1:
    if i == a:
       l1.remove(i)
print("Updated list:",str(l1))