abstract class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    // Abstract method
    public abstract void makeSound();
    
    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    // Implementation of abstract method
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    // Implementation of abstract method
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        
        dog.makeSound();
        dog.sleep();
        
        cat.makeSound();
        cat.sleep();
    }
}
