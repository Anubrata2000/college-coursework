   
amtwithdrawn=int(input("Enter withdrawn amount in hundreds:"))
if(amtwithdrawn>=100 and amtwithdrawn<1000):
    d=amtwithdrawn//100
    v=(amtwithdrawn%100)//50
    g=(((amtwithdrawn%100)%50)//10)
    h=(((amtwithdrawn%100)%50)%10)
    print("Currency notes of 100 required:",d)
    print("Currency notes of 50 required:",v)
    print("Currency notes of 10 required:",g)
    print("Amount still remaining:",h)
else:
    print("Enter value in hundreds again:")     
     
