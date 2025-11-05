// Define first interface
interface Animal {
    void eat();
    void sleep();
}

// Define second interface
interface Pet {
    void play();
}

// A class implementing multiple interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog is eating bones...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    public void play() {
        System.out.println("Dog is playing fetch!");
    }
}

// Main class
public class MultipleInterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.play();
    }
}
