class member:
    def __init__(self,name,cno):
        self.name=name
        self.cardno=cno
     
    def showdata(self):
        print(self.name)
        print(self.cardno)
        
class std_mem(member):
    def __init__(self,bl,rn,n,no):        
        self.booklimit=bl
        self.rollnumber=rn
        member.__init__(self,n,no)
    def display(self):
        print(self.booklimit,self.rollnumber)
        member.showdata(self)
        
ob1=std_mem(10,'MCA01','ABC',123456)
ob1.showdata()
ob1.display()        