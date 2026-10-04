str=input("Enter a string: ")
#c=0
#while(str!=''):
   # while(str[c]!=' '):
  #      c+=1
   #     if(c%2==0):
   #        print(str[ :c])
 #   str=str[c+1: ]
 
 

bc = str.split()
for i in bc:
    if (len(i)%2==0):
         print("Even length words:",i)
