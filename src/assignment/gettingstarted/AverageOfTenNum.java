package assignment.gettingstarted;

import java.util.Scanner;

public class AverageOfTenNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            double input = Double.parseDouble(sc.nextLine());
            sum += input;
        }
        System.out.println("Average: " + (sum / n));
    }

}
