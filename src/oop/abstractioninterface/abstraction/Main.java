package oop.abstractioninterface.abstraction;


public class Main {

    public static void main(String[] args) {

        Car petrolCar = new PetrolCar();
        petrolCar.spray("Red");
        petrolCar.speedUp(10);
        System.out.println("petrolCar: "+ petrolCar.getColor() + "Speed: " + petrolCar.getSpeed());

        Car electricCar = new ElectricCar();
        electricCar.spray("Blue");
        petrolCar.speedUp(5);
        System.out.println("electricCar: " + electricCar.getColor() + " " + electricCar.getSpeed());

    }
}
