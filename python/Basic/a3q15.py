for i in range(10):
    print("Set:",i)
    p = float(input("Enter p:"))
    r = float(input("Enter r:"))
    n = float(input("Enter n:"))
    q = float(input("Enter q:"))
    a = p * ((1+r/q)**(n*q))
    print("Amount:",a)
    
