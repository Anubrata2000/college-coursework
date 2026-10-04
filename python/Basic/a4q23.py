# Python program to find uncommon words from two string,

# Getting strings as input from the user 
str1 = input('Enter first string : ')
str2 = input('Enter second string : ')

# finding uncommon words
str1List = str1.split()
str2List = str2.split()
uncommonWords = ''
for words in str1List:
    if words not in str2List:
        uncommonWords = uncommonWords+" "+words
for words in str2List:
   if words not in str1List:
        uncommonWords = uncommonWords+" "+words
  
# printing uncommon words 
print("All uncommon words from both the string are :", uncommonWords)
