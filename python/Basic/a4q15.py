# Frequency of each character in string

# Get string from user
string = input("Enter some text: ")

# Set frequency as empty dictionary
frequency_dict = {}
for character in string:
    if character in frequency_dict:
        frequency_dict[character] += 1
    else:
        frequency_dict[character] = 1

print("\n--------------------------")
print("Character\tFrequency")
print("--------------------------")
for character, frequency in frequency_dict.items():
    print(character, frequency)