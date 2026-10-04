import java.lang.*;



class ExtendInter{
    public static void main(String[] args) {
        
        Dog dog = new Dog();

        
        dog.eat();
        dog.giveBirth();
    }
}


interface Animal {
    public void eat();
}


interface Mammal extends Animal {
    public void giveBirth();
}


class Dog implements Mammal {
    public void eat() {
        System.out.println("The dog is eating.");
    }

    public void giveBirth() {
        System.out.println("The dog just gave birth.");
    }
}

