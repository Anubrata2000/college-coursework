# Declaring a list
list = input("Enter a list of elements divided by spaces:")
list=list.split()
list1=[int(x) for x in list]
x=int(input("Enter the first element of the range:"))
y=int(input("Enter the last element of the range:"))
# delete element from index 1 to 30del list[1.3]
del list[x:y+1]

# print list after deleting
# element from index 1 to 3
print ("List element after deleting: ")
for l in range(len(list)):
	print (list[l])
