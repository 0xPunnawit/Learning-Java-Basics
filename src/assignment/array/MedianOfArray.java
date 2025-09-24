package assignment.array;

import java.util.Arrays;

public class MedianOfArray {

    public static void main(String[] args) {
        int[] example1 = {5, 7, 8, 6, 3};       // Expected: 6
        System.out.println("Ans: " + findMedian(example1));
        
        int[] example2 = {5, 7, 8, 6, 3, 1};    // Expected: 5.5
        System.out.println("Ans: " + findMedian(example2));

        int[] example3 = {5};                   // Expected: 5
        System.out.println("Ans: " + findMedian(example3));

        int[] example4 = new int[]{};           // Expected: 0
        System.out.println("Ans: " + findMedian(example4));

    }

    private static double findMedian(int[] arr) {
        int length = arr.length;

        if (length == 0) {
            return 0;
        }

        if (length == 1) {
            return arr[0];
        }

        Arrays.sort(arr);
        boolean isEven = length % 2 == 0;
        if (isEven) {
            return (arr[length / 2] + arr[(length / 2) -1]) * 0.5;
        }
        return arr[length / 2];

    }

}
