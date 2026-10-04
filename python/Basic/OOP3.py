class item:
    def __init__(self,name,price,qnt):
        self.name=name
        self.price=price
        self.quantity=qnt
          
    def purchase(self,qnt):
        self.quantity-=qnt
        
    def increasestock(self,qnt):   
        self.quantity+=qnt
        
    def showdata(self):
        print(self.name)
        print(self.price)
        print(self.quantity)
        
ob1=item('Makeup',5000,200)
ob1.purchase(50)        
ob1.increasestock(150)
ob1.showdata()