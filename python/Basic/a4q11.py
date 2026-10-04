'''Write a program to remove all the duplicates of a given string in python,keeping the first characters only.'''
string=input("Enter the string:")
p=""
for char in string:
    if char not in p:
        p=p+char
print(p)