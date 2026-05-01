// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Animal a;

        // Parent object
        a = new Animal();
        a.sound();

        // Child object (overriding in action)
        a = new Dog();
        a.sound();
    }
}
