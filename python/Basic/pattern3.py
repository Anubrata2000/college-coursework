a = 65
for i in range(1,4+1):
    for j in range(1, i+1):
        print("%c" %(a), end=" ")
    a+=1
    print()
for i in range(3,0,-1):
    for j in range(i,4):
        print(" ",end=" ")
    for k in range(0,i):
        print(chr(i+64),end=" ")
    print()    
    
        #OR
    
'''
i,c=65,0
while(i<69):
    print((chr(i)+" ")*(c+1))
    i+=1
    c+=1
i,s=3,0
while(i>0):
     print ("  "*s,(" "+chr(i+64))*i)
     i-=1;s+=1   
'''

        #OR


'''
for i in range(65,69):
    for j in range(65,i+1):
        print(chr(i), end=" ")
    print()
for i in range(3,0,-1):
    for j in range(i,4):
        print(" ",end=" ")
    for k in range(0,i):
        print(chr(i+64),end=" ")
    print()    
'''    
         #OR

'''
for i in range(65,68):
    for j in range(65,i+1):
        print(chr(i), end=" ")
    print()
for i in range(4,0,-1):
    for j in range(i,4):
        print(" ",end=" ")
    for k in range(0,i):
        print(chr(i+64),end=" ")
    print()    
'''    