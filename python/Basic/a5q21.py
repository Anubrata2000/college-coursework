#Iterate a list in reverse order.
list=input("Enter the list elements:").split()
list1=[int(i) for i in list]
res=[]
for i in range(len(list1)-1,-1,-1):
    res.append(list1[i])
print("List in reverse order:",res)        
