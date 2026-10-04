class account:
    def __init__(self,acname,acno):
        self.acname = acname
        self.acno = acno
        self.acbal = 0
    def deposit(self,amt):
        self.acbal += amt
    def withdrawal(self,amt):
        self.acbal -= amt
    def showdata(self):
        print(self.acname)
        print(self.acno)
        print(self.acbal)
    def __add__(self,ac):
        a = self.acbal + ac.acbal
        return a
    def __le__(self,ac):
        if self.acbal <= ac.acbal:
            return 1
    def __lt__(self,ac):
        if self.acbal < ac.acbal:
            return 1
    def __gt__(self,ac):
        if self.acbal > ac.acbal:
            return 1
    def __ge__(self,ac):
        if self.acbal >= ac.acbal:
            return 1
    def __sub__(self,ac):
        a = self.acbal - ac.acbal
        return a    
ac1 = account('pqr', 12)
ac2 = account('abc', 13)
ac1.deposit(5000)
ac2.deposit(10000)
ac3 = ac1+ac2
print(ac3)
if ac1 >= ac2:
    print('ac1 is greater')
else:
    print('Not less')
        