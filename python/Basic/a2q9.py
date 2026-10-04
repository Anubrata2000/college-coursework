stk=int(input("Enter stock the company have: "))
odr=int(input("Enter the quantity order: "))
credit=int(input("Enter the credit done by customer: "))
if (stk>=odr and credit>=(100*odr)):
      print("\n\nYour order has been placed successfully and will be delivered to you shortly.");
	
if (stk>=odr and credit<(100*odr)):
      print("\nYour payment done is not sufficient for your ordered items.\nTry again!!");
		
if (stk<odr and credit>=(100*odr)):
      print("\n\nWe have not sufficient items, but they will delivered to you shortly.");
