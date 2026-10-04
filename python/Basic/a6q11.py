def sumoflist():
    l=input("Enter a list of numbers divided by space: ").split()
    sum=0
    l1=[int(x) for x in l]
    for i in l1:
        sum+=i
    return sum


print("Sum of all numbers in a list: ",sumoflist())
 