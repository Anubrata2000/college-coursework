#Write a program to count the no. of matching characters in a pair of string.

s1 =input("Enter the 1st string:")
s2 =input("Enter the 2nd string:")
str1=len(s1)
str2=len(s2)
c=0
i=0
while i<str1:
    j=0
    while j<str2:
        if(s1[i]==s2[j]):
            c+=1
        j+=1
    i+=1
print("No. of matching characters are:",c)

'''
str1 =input("Enter the 1st string:")
str2 =input("Enter the 2nd string:")
s1=set(str1)
s2=set(str2)
c=0
for i in s1:
    for j in s2:
        if i==j:
            c+=1
print("No. of matching characters are:",c)'''