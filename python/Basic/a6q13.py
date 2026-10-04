def revstring(str1):
    i=len(str1)-1
    a=0
    str2=""
    while(i>=0):
        str2[a]+=str1[i]
        a+=1;i-=1 
  
str1=input("Enter a string: ")
print("Reversed string: ",revstring(str1))    




'''
def my_function(x):
  return x[::-1]

mytxt = my_function("I wonder how this text looks like backwards")

print(mytxt)
'''