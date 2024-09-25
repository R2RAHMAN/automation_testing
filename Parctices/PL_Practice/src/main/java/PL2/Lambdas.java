package PL2;

import java.util.Arrays;
import java.util.List;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}



public class Lambdas {
    public static void main(String[] args) {

        Animal animal = new Dog();  // Upcasting
        Dog dog = (Dog) animal;     // Downcasting
        dog.bark();  // Now works because we cast animal back to Dog  // Works fine because Animal has this method
    }
}
