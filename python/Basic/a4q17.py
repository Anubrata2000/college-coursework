str=input("Enter a string: ")
c=0
specialchar=set('@_!#$%^&*()<>?/\|}{~:')
for i in str:
    if i in specialchar:
        c+=1
if c>=1:
   print("String contains special character")
else:
   print("String doesn't contain special character")         