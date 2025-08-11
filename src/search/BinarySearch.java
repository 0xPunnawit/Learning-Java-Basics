package search;

import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        var nums = List.of(1, 2, 13, 34, 67, 81);
        System.out.println("Element 67 is exists: " + binarySearch(nums, 67));
        System.out.println("Element 90 is exists: " + binarySearch(nums, 90));

    }

    private static boolean binarySearch(List<Integer> nums, int target) {

        int left = 0;
        int right = nums.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int curr = nums.get(mid);
            if (curr == target) {
                return true;
            } else if (curr < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }


}
