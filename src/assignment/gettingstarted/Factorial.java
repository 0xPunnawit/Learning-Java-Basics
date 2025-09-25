package assignment.gettingstarted;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();

        int n = Integer.parseInt(input);
        // 5! = 5 * 4 * 3 * 2 * 1

        int ans1 = iterative1(n);
        int ans2 = iterative2(n);
        int ans3 = recursive(n);

        System.out.println("ans: " + ans1);
        System.out.println("ans: " + ans2);
        System.out.println("ans: " + ans3);

    }

    private static int iterative1(int n) {
        if (n <= 1) {
            return 1;
        }
        int ans = 1;
        for (int multiplier = 2; multiplier <=n; multiplier++) {
            ans *= multiplier;
        }
        return ans;
    }

    private static int iterative2(int n) {
        if (n <= 1) {
            return 1;
        }
        int ans = 1;
        int multiplier = 2;
        while (multiplier <= n) {
            ans *= multiplier;
            multiplier++;
        }
            return ans;
    }

    private static int recursive(int n) {
        if (n <= 1) {
            return 1;
        }

        return recursive(n - 1) * n;
    }


}
