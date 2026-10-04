def string_ops(string1, string2):
  # counting the length of a string
  length_string1 = len(string1)
  length_string2 = len(string2)

  # deleting 5th character of the string
  string1_without_5th_char = string1[:4] + string1[5:]
  string2_without_5th_char = string2[:4] + string2[5:]

  # adding '#' at the 5th position of the string
  string1_with_hash = string1[:4] + "#" + string1[4:]
  string2_with_hash = string2[:4] + "#" + string2[4:]

  # concatenating two strings
  concatenated_strings = string1 + string2

  return (length_string1, length_string2, string1_without_5th_char, string2_without_5th_char, string1_with_hash, string2_with_hash, concatenated_strings)

string1 = "Hello"
string2 = "World"

length_string1, length_string2, string1_without_5th_char, string2_without_5th_char, string1_with_hash, string2_with_hash, concatenated_strings = string_ops(string1, string2)

print("Length of string 1: ", length_string1)
print("Length of string 2: ", length_string2)
print("String 1 after deleting 5th character: ", string1_without_5th_char)
print("String 2 after deleting 5th character: ", string2_without_5th_char)
print("String 1 after adding '#' at 5th position: ", string1_with_hash)
print("String 2 after adding '#' at 5th position: ", string2_with_hash)
print("Concatenated strings: ", concatenated_strings)
