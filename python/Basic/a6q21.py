def isPalindrome(string):
	left_pos = 0
	right_pos = len(string) - 1
	
	while right_pos >= left_pos:
		if not string[left_pos] == string[right_pos]:
			return False
		left_pos += 1
		right_pos -= 1
	return True

string=input("Enter a string: ")
print(isPalindrome(string)) 




'''
def palindrome(str1): 
        str2=str1[::-1]
        if str1 == str2: 
            return ("The string is a palindrome.")
        else: 
            return ("The string is not a palindrome.") 
 
 
string = input ("Enter string: ") 
print(Palindrome(string))

'''