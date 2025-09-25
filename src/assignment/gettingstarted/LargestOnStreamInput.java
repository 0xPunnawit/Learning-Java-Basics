package assignment.gettingstarted;

import java.util.Scanner;

public class LargestOnStreamInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("""
                Largest number on stream input
                Please type any integer to find largest value
                Note: Type 0 or negative to stop stream
                """);

        String userInput;
        int largest = 0;
        while (true) {
            System.out.print("Number: ");
            userInput = sc.nextLine();
            // If input cannot parse, let them error
            int n = Integer.parseInt(userInput);
            if (n <= 0) {
                break;
            }

            if (n > largest) {
                largest = n;
                System.out.println("Largest number has changed to " + largest);
            }
        }
    }
}
