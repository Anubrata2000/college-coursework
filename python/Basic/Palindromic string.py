 def palindrome(nm):
    return(nm[-1])
n=input("Enter a string=")
if n is palindrome(n):
    print(n,"is palindromic string")
else:
    print(n,"is not a palindromic string")
#or
#def palindromic(nm):
    #i=0
    #j=len(nm)-1
    #while(i<len(nm)//2):
        #if(nm[i]=nm[j]):
            #print(nm,"is not a palindromic string")
            #break
        #else:
            #i==1
            #j-=1
        #else:
           #print(nm,"is palindromic")
            
#name=input("Enter any string")            
#palindromic(name)
    
