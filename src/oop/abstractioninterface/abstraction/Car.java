package oop.abstractioninterface.abstraction;

public abstract class Car {

    private String color;
    private int speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void spray(String color) {
        this.color = color;
    }

    abstract void speedUp(int speed);
    abstract void slowDown(int speed);
    abstract void turnLeft();
    abstract void turnRight();
}
