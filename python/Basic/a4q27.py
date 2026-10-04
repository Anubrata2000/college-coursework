str1=input("Enter a string: ")
str1=str1.split()
word=input("Enter a string: ")
i,location=0,0
while i<len(str1):
    if str1[i]==word:
       location=i+1
i+=1       
print("The location of word is: ",location)       




'''
# Python3 code to demonstrate working of
# Word location in String
 
 
# initializing string
test_str = input("Enter a string: ")
 
# printing original string
print("The original string is : " + test_str)
 
# initializing word
wrd = input("Enter a string: ")
 
x=test_str.split()
res=x.index(wrd)+1
 
# printing result
print("The location of word is : " + str(res))
'''