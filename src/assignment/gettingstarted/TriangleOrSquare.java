package assignment.gettingstarted;

import java.util.Scanner;

public class TriangleOrSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Area calculate program
                'T' => Triangle
                'S' => Square
                """);

        System.out.print("Enter choice:" );
        String choice = sc.nextLine();

        if (choice.equals("T")) {
            System.out.println("Enter base: ");
            int base = sc.nextInt();

            System.out.println("Enter height: ");
            int height = sc.nextInt();

            double area = 0.5 * base * height;
            System.out.println("Area: " + area);
        } else if (choice.equals("S")) {
            System.out.println("Enter side length: ");
            int sideLength = sc.nextInt();
            int area = sideLength * sideLength;
            System.out.println("Area: " + area);
        } else {
            System.out.println("Invalid choice");
        }
    }

}
