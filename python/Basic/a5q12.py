#Program to find the position of minimum and maximum elements of a list.
list=input("Enter the list of elements:").split()
min=list[0]
max=list[0]
i=1
max1,min1=0,0
while i<len(list):
    if list[i]>max:
        max=list[i]
        max1=i
    if list[i]<min:
        min=list[i]
        min1=i
    i+=1
print("The position of maximum elements in the list",list,"is:",max1)
print("The position of minimum elements in the list",list,"is:",min1)