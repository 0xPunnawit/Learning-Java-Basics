package oop.association;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Punnawit", 22);
        p1.addAddress(new Address("Bangkok", "12345"));
        System.out.println(p1.getName() + " " + p1.getAge());

        Person p2 = new Person("Ing", 20);
        System.out.println(p2.getName() + " " + p2.getAge());


        Address a1 = new Address("Bangkok", "12345");
        System.out.println(a1.getCity() + " " + a1.getPostalCode());

        Address a2 = new Address("Chonburi", "67890");
        System.out.println(a2.getCity() + " " + a2.getPostalCode());

        p1.addAddress(a1);
        p2.addAddress(a2);
    }

}
