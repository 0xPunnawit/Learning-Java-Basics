package assignment.array;

public class IsTheArraySorted {

    public static void main(String[] args) {

        // Assume every element is unique
        int[] expectedTrue = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Ans: " + isAscSorted(expectedTrue));

        // next > previous
        int[] expectedFalse = {1, 2, 3, 5, 4, 6, 7, 9, 8};
        System.out.println("Ans: " + isAscSorted(expectedFalse));

    }

    private static boolean isAscSorted(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        // Assume right now we have more than 2 element
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = arr[i - 1];
            if (current < previous) {
                return false;
            }
        }

        return true;
    }

}
