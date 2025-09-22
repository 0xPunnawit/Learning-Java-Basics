package oop.inheritance;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("John");
        human.speak();
        human.walk(5);

        Dog dog = new Dog();
        dog.setName("Buddy");
        dog.speak();

        Cat cat = new Cat();
        cat.setName("Whiskers");
        cat.speak();

        System.out.println();
        Human developer = new Developer();
        developer.setName("Developer");
        developer.walk(10);

        Human businessMan = new BusinessMan();
        businessMan.setName("Business");
        developer.walk(20);


    }
}
