l=input("Enter numbers in a list divided by space: ")
l=l.split()
l1=[int(x) for x in l]
M=int(input("Enter a number: "))
N=int(input("Enter a number: "))
for i in l1:
    if i % M == 0 and i % N == 0:
        print("The numbers in the list which are divisible by M and N are:",i,end=" ")