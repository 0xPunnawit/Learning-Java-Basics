package oop.polymorphism.overloading;


import oop.basic.ColorOfCar;

public class Car {

    private ColorOfCar color;
    private String brand;
    private int tires;

    // ============ Constructor ============
    public Car() {
        System.out.println("สร้าง Object Car แล้ว");
    }

    public Car(ColorOfCar color, String brand, int tires) {
        this.color = color;
        this.brand = brand;
        this.tires = tires;
    }

    // ============ Getter & Setter ============
    public ColorOfCar getColor() {
        return color;
    }

    public void setColor(ColorOfCar color) {
        this.color = color;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    // ============ toString ============
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", tires=" + tires +
                '}';
    }

    public ColorOfCar getColorOfCar() {
        return this.color;
    }

    public void spray(ColorOfCar color) {
        this.color = color;
    }

    public void spray(String color) {
        this.color = ColorOfCar.valueOf(color);
    }
}
