#Program to sort the elements of given list in Ascending and Descending Order.
list=input("Enter the list of elements:").split()
list1=[int(i) for i in list]
for i in range(0,len(list1)):
    for j in range(i+1,len(list1)):
        if list1[i]>list1[j]:
            list1[i],list1[j]=list1[j],list1[i]
            #t=list1[i]
            #list1[i]=list1[j]
            #list1[j]=t
print("After sorting in ascending order:",list1)