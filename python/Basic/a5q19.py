l=input("Enter a list of numbers divided by space: ")
l=l.split()
l1=[int(x) for x in l]
l2=list()
start=int(input("Enter the start position: "))
end=int(input("Enter the end position: "))
l2=l1[start:end+1]
print("Updated list:",l2)