'''Write a program to maximum frequent characters in String'''
string=input("Enter the string: ")
freq={} 
for i in string:
    if i in freq:
        freq[i]+=1
    else:
        freq[i]=1
maxfreq = max(freq,key=freq.get)
print("Entered String is",string)
print(string,"is the maximum frequent character with frequency of",freq[maxfreq])