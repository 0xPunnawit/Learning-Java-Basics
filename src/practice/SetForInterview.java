package practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForInterview {

    // HashSet -> Handing case of unique or duplicate detection
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>(
                List.of(8,9,3,2,7,9,1,3,5,1,1,0,2)
        );

        System.out.println(integerSet);
        System.out.println();

        System.out.println(isContainDuplicate(List.of(8,9,3,2,7,9,1,3,5,1,1,0,2)));
    }

    private static boolean isContainDuplicate(List<Integer> input) {
        boolean isDuplicate = false;
        Set<Integer> seen = new HashSet<>();

        for (var n : input) {
            if (seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }

        return isDuplicate;
    }


}
