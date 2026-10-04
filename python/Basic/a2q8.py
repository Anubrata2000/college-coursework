A=float(input("Enter marks for main subject considering 100 as full marks: "))
B=float(input("Enter marks for subsdiary subject considering 100 as full marks: "))
print("Percentage of A",A)
print("Percentage of B",B)
if (A>=55 and B>=45):
    print("Student qualified for degree")
elif (A>=45 and B>=55):
    print("Student qualified for degree")
elif (A>=65 and B<45):
    print("Student allowed to reappear for exam B")
else:
    print("Student declared fail")
