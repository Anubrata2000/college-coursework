def even():
    l=input("Enter a list divided by space:").split()
    l1=[int(x) for x in l]
    for i in l1:
      if i % 2 == 0:
         print(i, end=' ')
even()           
            
    