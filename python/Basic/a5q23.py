l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
l2=list();l3=list()
a=len(l1)/2
print(a)
l2=l1[:int(a)]
l3=l1[int(a):]
print("First half of the original list: ",l2)
print("Second half of the original list: ",l3)