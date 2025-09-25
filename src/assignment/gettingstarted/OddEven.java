package assignment.gettingstarted;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = Integer.parseInt(sc.nextLine());
        solution1(n);
        solution2(n);

    }

    private static void solution1(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    private static void solution2(int n) {
        String result = switch (n % 2) {
            case 0 -> "even";
            case 1 -> "odd";
            default -> "N/A";
        };
        System.out.println(n + " is " + result);
    }

}
