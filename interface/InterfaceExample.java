// Define an interface
interface Animal {
    void eat();
    void sleep();
}

// Implement the interface in a class
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating...");
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();
        dog.sleep();

        cat.eat();
        cat.sleep();
    }
}
