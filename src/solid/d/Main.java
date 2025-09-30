package solid.d;

import solid.d.good.Engine;
import solid.d.good.Car;

public class Main {

    public static void main(String[] args) {

        // BAD
//        Car car = new Car("TTT");
//        car.start();


        // GOOD
        Engine engine = new Engine("E", 2000);
        Car car = new Car("TTT", engine);
        car.start();

    }
}
