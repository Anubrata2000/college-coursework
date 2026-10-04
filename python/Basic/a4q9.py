str=input("Enter a string:")
j,c,c1,c2,c3,c4=0,0,0,0,0,0
while(j<len(str)):
    i=str[j]
    if (i=='A' or i=='a'):
        c+=1
    if (i=='E' or i=='e'):
        c1+=1
    if (i=='I' or i=='i'):    
        c2+=1
    if (i=='O' or i=='o'):
        c3+=1
    if (i=='U' or i=='u'):
        c4+=1
    j+=1    
if (c>=1 and c1>=1 and c2>=1 and c3>=1 and c4>=1):
   print("String accepted")
else:
   print("String rejected")        