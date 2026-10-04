l=["Lion", "Li", "Tiger", "Tig"]
str1=input("Enter a string: ")
for i in l:
    if i.startswith(str1) or str1.startswith(i):
        print(i,end=" ")
print() #optional