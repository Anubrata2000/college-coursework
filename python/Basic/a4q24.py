str1=input("Enter a string: ")
str2=""
for i in str1:
    if i==',' :
        str2+='.'
    elif i=='.' :
        str2+=','
    else:
        str2+=i
print (str2)       




''' def Replace(str1):
    str1 = str1.replace(',','.',2)
    str1 = str1.replace('.', ',',2)
    #str1 = str1.replace('third', '.')
    return str1
     
#string = "14, 625, 498.002"
string=input("Enter a string: ")
print(Replace(string))    '''