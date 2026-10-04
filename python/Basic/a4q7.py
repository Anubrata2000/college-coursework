def capitalize_first_last_letters(str1):
    str1=str1.title()
    result=""
    for i in str1.split():
        result+=i[:-1] + i[-1].upper() + " "
    return result[:-1]
    #print(str1)

str2=input("Enter a string: ")
print(capitalize_first_last_letters(str2))