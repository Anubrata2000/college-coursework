def multiplyoflist():
    l=input("Enter a list of numbers divided by space: ").split()
    mul=1
    l1=[int(x) for x in l]
    for i in l1:
        mul*=i
    return mul


print("Multiplication of all numbers in a list: ",multiplyoflist())