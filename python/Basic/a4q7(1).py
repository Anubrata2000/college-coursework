#Write a program to capitalize first and last character of string.
string=input("Enter a string:")
ch=list(string)
i=0
while(i<len(ch)):
    k=i
    while(i<len(ch) and ch[i]!=' '):
        i+=1
    if(ord(ch[k])>=97 and ord(ch[k])<=122):
        ch[k]=chr(ord(ch[k]-32))
    else:
        ch[k]=ch[k]
    if(ord(ch[i-1])>=90 and ord(ch[i-1])<=122):
        ch[i-1]=chr(ord(ch[i-1])-32)

    else:
        ch[i-1]=ch[i-1]
    i+=1
    print(ch)