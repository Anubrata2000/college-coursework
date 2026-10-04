def pronic():
   x  = int(input("Enter the first range: "))
   y  = int(input("Enter the second range: "))
   for i in range(x,y+1):
       a = i*(i+1)
       if a in range(x,y+1):
            print(a)
            
pronic()            
        
