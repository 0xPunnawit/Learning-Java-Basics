package practice;

import java.util.Arrays;

public class StringForInterview {

    public static void main(String[] args) {

        String bookName = "Psychology of Money";                // Characters with spaces 19

        String number = String.valueOf(5);
        System.out.println(number);

        System.out.println(bookName.length());                  // Output: 19 TC: O(1)

        // Convert to char array
        System.out.println(bookName.toCharArray());             //  TC: O(n)

        // UpperCase & LowerCase
        System.out.println(bookName.toUpperCase());
        System.out.println(bookName.toLowerCase());

        System.out.println(bookName.charAt(4));                 // Output: h

        System.out.println(bookName.substring(5));    // Output: Start from index 5 -> ology of Money
        System.out.println(bookName.substring(2, 9));           // Output: ycholog

        String newBookName = "Platform Engineering On Kubernetes with Java";

        // Output: Platform Engineering On Kubernetes with Golang
        System.out.println(newBookName.replace("Java", "Golang"));

        String Data = "$aG:VsbG&8K._";
        for (var c : Data.toCharArray()) {
            System.out.println();
            System.out.println(c);
            System.out.println(Character.isLetter(c));          // Check if character is a letter
            System.out.println(Character.isUpperCase(c));       // Check if character is uppercase
            System.out.println(Character.isDigit(c));           // Check if character is a digit
            System.out.println(Character.isLetterOrDigit(c));   // Check if character is a letter or digit
        }

        System.out.println();

        // String - Immutable
        String firstName = "Punnawit";
        String lastName = "Rodsai";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);                           // Output: Punnawit Rodsai TC: O(n)


        StringBuilder sb = new StringBuilder();                 // ใช้สำหรับ สร้าง/แก้ไขข้อความ ต่อ String
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        System.out.println(sb.toString());                      // Output: Punnawit Rodsai
        System.out.println();

        String exampleMessage = "fjdklsfhjsdashdopwqzz";
        int[] counter = new int[26];
        for (char c : exampleMessage.toCharArray()) {
            if (Character.isLetter(c)) {
                int distant = Character.toLowerCase(c) - 'a';
                counter[distant]++;
            }
        }
        // Output: [1, 0, 0, 3, 0, 2, 0, 2, 0, 2, 1, 1, 0, 0, 1, 1, 1, 0, 3, 0, 0, 0, 1, 0, 0, 2]
        System.out.println(Arrays.toString(counter));


        for (int i = 0; i < counter.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ": " + counter[i]);
        }


    }

}
