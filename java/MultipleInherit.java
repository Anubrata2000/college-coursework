class MultipleInherit{
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.eat();
    }
}


interface Animal {
    public void eat();
}

interface Vehicle {
    public void drive();
}

class Car implements Vehicle, Animal {
    public void drive() {
        System.out.println("The car is being driven.");
    }

    public void eat() {
        System.out.println("The car is not capable of eating.");
    }
}
