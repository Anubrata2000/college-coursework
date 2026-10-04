n=input("Enter a string of digits:")
while(n!=''):
    d=n[0]
    dgt=ord(d)-ord('0')
    print(dgt,end=" ")
    n=n[1: ]