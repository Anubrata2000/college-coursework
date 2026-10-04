class parent:
    def __init__(self,num1,num2):
        self.number1=num1
        self.number2=num2
        
    def showdata(self):
        print(self.number1)
        print(self.number2)
        
class child(parent):
    def __init__(self,sum,n1,n2):
        self.sum=0
        parent.__init__(self, n1, n2)
    def add(self):
        self.sum=self.n1+self.n2        
    def display(self):
        print(self.sum)
        parent.showdata(self)
        
ob1=child()
ob1.add()
ob1.showdata()
ob1.display() 