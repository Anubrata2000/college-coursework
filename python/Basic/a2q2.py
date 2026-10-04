age=int(input("Enter your age: "))
sex=input("Enter Gender m For Male And f For Female: ")
loc=input("Enter Location c For City And v For Village: ")
health=input("Enter Health e For Excellent And p For Poor:")
if ((health=='e')and(loc=='c')and(sex=='m')and(age>=25 or age<=35)):
        print("His premium is Rs. 4 per thousand and his policy amount cannot exceed Rs. 2 lakhs.")
elif((health=='e')and(loc=='c')and(sex=='f')and(age>=25 or age<=35)):
        print("Her premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh.")
elif((health=='p')and(loc=='v')and(sex=='m')and(age>=25 or age<=35)):
        print("Her premium is  Rs. 6 per thousand and his policy cannot exceed Rs. 10000.") 
else:
        print("Not Insured")
