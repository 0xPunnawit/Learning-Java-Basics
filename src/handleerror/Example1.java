package handleerror;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int input1 = Integer.parseInt(sc.nextLine());
            int input2 = Integer.parseInt(sc.nextLine());
            int ans = input1 / input2;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println("We got unexceptable value");
        } catch (NumberFormatException e) {
            System.out.println("Some number cannot parse to number");
        }
    }
}
