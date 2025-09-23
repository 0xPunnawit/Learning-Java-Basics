package oop.polymorphism.overriding;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }
}
