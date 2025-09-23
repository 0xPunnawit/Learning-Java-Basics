package oop.polymorphism.overriding;

public class Main {

    public static void main(String[] args) {

        Animal animal;
        animal = new Human();
        animal.makeSound();
        System.out.println();

        animal = new Dog();
        animal.makeSound();
        System.out.println();

        animal = new Cat();
        animal.makeSound();
        System.out.println();

    }


}
