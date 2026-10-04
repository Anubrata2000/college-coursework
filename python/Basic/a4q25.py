from itertools import permutations
def allPermutations(str):
   permList = permutations(str)
   for perm in list(permList):
         print (''.join(perm))
str = input("Enter a string: ")
allPermutations(str)    


'''from itertools import permutations
import string
 
s = input("Enter a string: ")
a = string.ascii_letters
p = permutations(s)
 
# Create a dictionary
d = []
for i in list(p):
 
    # Print only if not in dictionary
    if (i not in d):
        d.append(i)
        print(''.join(i))   
'''        