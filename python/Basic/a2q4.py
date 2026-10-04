days=int(input("Enter number of days member is late to return the book: "))
if (days==1 and days<=5):
     print("Your fine is 50 paise")
elif (days==6 and days<=10):
     print("Your fine is one rupee")
elif (days>10 and days<=29):
     print("Your fine is 5 rupees")
elif (days>30):
     print("Your membership is cancelled")

