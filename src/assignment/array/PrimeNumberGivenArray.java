package assignment.array;

import static assignment.array.PrimeNumberUtil.isPrime;

public class PrimeNumberGivenArray {

    public static void main(String[] args) {

        int[] example = {22, 58, 53, 7, 100, 11, 106, 67, 88};
        for (int n : example) {
            boolean isCurrentNumberPrime = isPrime(n);

            if (isCurrentNumberPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }

    }

}
