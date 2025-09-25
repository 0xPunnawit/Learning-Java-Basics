package solid.o;

import solid.o.good.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
         * Open Closed Principle (OCP)
         * Software components should be open for extension, but closed for modification.
         * */
        List<Shape> shapes = List.of(
                new Circle(3),
                new Rectangle(2,3),
                new Square(2)

                // New requirement - Handle square
        );
        AreaCalculator areaCalculator = new AreaCalculator(shapes);
        System.out.println(areaCalculator.sumArea());


    }
}