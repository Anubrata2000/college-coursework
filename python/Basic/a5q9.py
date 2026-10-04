l=input("Enter a list of elements divided by space:")
l=l.split()
print(l)
a=int(input("Enter an element:"))
c=0
for i in l:
    print(i)
    if  i==a:
        print(l.index(i))
        c+=1
    if  c==1:
        break        
    
    
    
    
    
'''
# declare a list of Integers
list = [10, 20, 10, 20, 30, 40, 50]

# printing index of 10 
print (list.index (10))

#printing index of 20
print (list.index (20))

# printing index of 30
print (list.index (30))

# printing index of 40
print (list.index (40))

# printing index of 50
print (list.index (50))
'''    