a = [1, 2, 3, 4, 5]
 
# printing the list using loop
for x in range(len(a)):
    print (a[x])
    
    
'''    
# Python program to print list
# without using loop
 
a = [1, 2, 3, 4, 5]
 
# printing the list using * operator separated
# by comma
print(*a)
 
# printing the list using * and sep operator
print("printing lists separated by commas")
 
print(*a, sep = ", ")
 
# print in new line
print("printing lists in new line")
 
print(*a, sep = "\n")

'''
'''

a =["Geeks", "for", "Geeks"]
 
# print the list using join function()
print(' '.join(a))
 
# print the list by converting a list of
# integers to string
a = [1, 2, 3, 4, 5]
 
print str(a)[1:-1]

'''

'''
a = [1, 2, 3, 4, 5]
print(' '.join(map(str, a)))
 
print"in new line"
print('\n'.join(map(str, a)))

'''
'''

a = [1, 2, 3, 4, 5]
[print(i, end=' ') for i in a]
 
print("\nIn new line")
[print(i) for i in a]
   
'''