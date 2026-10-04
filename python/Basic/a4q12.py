'''Write a program to least frequent characters in String'''
string=input("Enter the string: ")
freq={}
for i in string:
    if i in freq:
        freq[i]+=1
    else:
        freq[i]=1
minfreq = min(freq,key=freq.get)
print("Entered String is",string)
print(string,"is the least frequent character with frequency of",freq[minfreq])