package oop.composition;

public class Car {

    private final String brand;
    private final Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine("E", 2000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                '}';
    }
}
