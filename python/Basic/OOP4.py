class Vehicle:
    def __init__(self,regno,make,model,colour):
        self.registrationnumber=regno
        self.make=make
        self.model=model
        self.colour=colour
        
    def set_colour(self,colour):
        self.colour=colour
        
    def get_colour(self):
        return self.colour
    
    def set_noOfdoors(self,nod):
        self.numberofdoors=nod
        
    def get_noOfdoors(self):
        return self.nod
     
     
    def showdata(self):
        print(self.registrationnumber)
        print(self.make)
        print(self.model)
        print(self.colour)
        
class PassengerVehicle(Vehicle):
    def __init__(self,regno,make,model,colour,mxple):        
        self.maxpassenger=mxple
        Vehicle.__init__(self,regno,make,model,colour)
        
class CommercialVehicle(Vehicle):
    def __init__(self,regno,make,model,colour,mxload):        
        self.maxload=mxload
        Vehicle.__init__(self,regno,make,model,colour)
        
class Car(PassengerVehicle):
    def __init__(self,regno,make,model,colour,mxple,nod):
        self.numberofdoors=nod
        PassengerVehicle.__init__(self,regno,make,model,colour,mxple)
    
class Autorickshaw(PassengerVehicle):
     def __init__(self,regno,make,model,colour,mxple):
         PassengerVehicle.__init__(self,regno,make,model,colour,mxple)

class Bus(PassengerVehicle):    
     def __init__(self,regno,make,model,colour,mxple,nod,dd):
        self.numberofdoors=nod
        self.doubledecker=dd
        PassengerVehicle.__init__(self,regno,make,model,colour,mxple)
           
            
        
ob1=PassengerVehicle(12345,'BMW','X5 Series','Metallic',4)        
ob2=CommercialVehicle(54321,'TATA','Magic','White',100)
ob3=Vehicle(78945,'Lamborghini','Hurracan','Black')
ob4=Car(1234,'Tata','XYZ','Red',5,4)
ob4.set_noOfdoors(6)
ob4.get_noOfdoors()
ob3.set_colour("Gold")
ob3.get_colour()
ob3.showdata()
print(ob3.get_colour)
