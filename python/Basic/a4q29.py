def rotate(input,d):
   # Slice string in two parts for left and right
   Lfirst = input[0 : d]
   Lsecond = input[d :]
   Rfirst = input[0 : len(input)-d]
   Rsecond = input[len(input)-d : ]
   print ("Left Rotation : ", (Lsecond + Lfirst) )
   print ("Right Rotation : ", (Rsecond + Rfirst) )
   
str1 = input("Enter String ::>")
d=2
rotate(str1,d)