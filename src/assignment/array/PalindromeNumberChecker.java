package assignment.array;

public class PalindromeNumberChecker {

    public static void main(String[] args) {

        int[] expectedTrue1 = {1, 2, 3, 3, 2, 1};
        System.out.println(isPalindrome(expectedTrue1));

        int[] expectedTrue2 = {1, 2, 3, 2, 1};
        System.out.println(isPalindrome(expectedTrue2));

        int[] expectedFalse = {1, 2, 3, 8, 7, 3, 2, 1};
        System.out.println(isPalindrome(expectedFalse));
    }

    private static boolean isPalindrome(int[] arr) {

        for (int left = 0, right = arr.length - 1; left <= right; left++, right--) {
            if (arr[left] != arr[right]) {
                return false;
            }
        }

        return true;
    }
}
