l=input("Enter a list of elements seperated by comma:")
l=l.split(',')
print("The list elements are:",l," ")

#to append elements in the list

l.append(60)
print("Updated list:",l)
l.append('60')
print("Updated list:",l)
l.append('@#$%')
print("Updated list:",l)
l.insert(6,70)
print("Updated list:",l)

#to remove elements in the list

l.pop(5)  #to pop indexed element
print("Updated list:",l)
l.pop()   #pops the last element
print("Updated list:",l)


print("Final list:",l)
