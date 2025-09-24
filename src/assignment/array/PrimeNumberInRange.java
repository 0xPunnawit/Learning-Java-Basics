package assignment.array;

import java.util.Scanner;

import static assignment.array.PrimeNumberUtil.isPrime;

public class PrimeNumberInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range number to find prime number: ");
        int endRange = Integer.parseInt(sc.nextLine());
        for (int n = 2; n <= endRange; n++) {
            boolean isCurrentNumberPrime = isPrime(n);

            if (isCurrentNumberPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }

    }
}
