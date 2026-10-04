#Program to find the differences of two lists.
list=input("Enter the first list elements:").split()
list1=[int(i) for i in list]
list2=input("Enter the second list elements:").split()
list3=[int(i) for i in list2]
res=[]
for i in list1:
    if i not in list3:
        res.append(i)
for i in list3:
    if i not in list1:
        res.append(i)
print("After difference of two lists:",res)