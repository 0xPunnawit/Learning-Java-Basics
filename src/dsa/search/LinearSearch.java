package dsa.search;

import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {

        var nums = List.of(1, 2, 13, 34, 67, 81);
        System.out.println("Element 67 is exists: " + linearSearch(nums, 67));
        System.out.println("Element 17 is exists: " + linearSearch(nums, 17));

    }

    public static int linearSearch(List<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }



}
