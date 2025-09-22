package oop.basic;

public class Main {

    public static void main(String[] args) {

        Car carA = new Car();       // Instance of Car Object
        carA.setColor(ColorOfCar.RED);
        carA.setBrand("Toyota");
        carA.setTires(4);
        System.out.println(carA);

        System.out.println("---------------");

        Car carB = new Car();
        carB.setColor(ColorOfCar.BLACK);
        carB.setBrand("Honda");
        carB.setTires(4);
        System.out.println(carB);

        System.out.println("---------------");

        Car carC = new Car();

    }

}
