package stream;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result =numbers.stream()
                .map(n -> n * 2)        // คูณด้วย 2
                .filter(n -> n > 5)     // คัดเอาเฉพาะค่าที่มากกว่า 5
                .toList();                     // เก็บกลับเป็น List ใหม่
        System.out.println(result);            // Output: [6, 8, 10]


        List<String> names = List.of("John", "Jane", "Alice", "Bob", "Charlie");
        List<String> upper = names.stream()
                .map(String::toUpperCase)
                .sorted()                      // เรียง A-Z
                .toList();
        System.out.println(upper);             // Output: [ALICE, BOB, CHARLIE, JANE, JOHN]


        List<Integer> numbers2 = List.of(1, 3, 7, 11, 21, 16);
        Integer sum = numbers2.stream()
                .filter(n -> n > 10)    // คัดเอาเฉพาะค่าที่มากกว่า 10
                .reduce(0, Integer::sum);    // Integer::sum คือ method reference เทียบเท่ากับ (a, b) -> a + b
        System.out.println(sum);               // Output: 48 -> 11 + 21 + 16 = 48


        List<Integer> limited = numbers2.stream()
                .skip(2)   // ข้าม 2 ตัวแรก
                .limit(2)  // เอาแค่ 2 ตัวถัดไป
                .toList();
        System.out.println(limited); // Output: [7, 11]


        List<Integer> numsWithDup = List.of(1, 2, 2, 3, 3, 3, 4);
        List<Integer> distinct = numsWithDup.stream()
                .distinct()           // ตัดค่าซ้ำ
                .toList();
        System.out.println(distinct); // Output: [1, 2, 3, 4]


        long count = names.stream()
                .filter(name -> name.length() > 4)
                .count();
        System.out.println(count); // Output: 2 (Alice, Charlie)


        numbers.stream().forEach(n -> System.out.println("Value: " + n));
        // Output: Value: 1
        // Output: Value: 2
        // Output: Value: 3
        // Output: Value: 4
        // Output: Value: 5


        var groupedByLen = names.stream()
                .collect(java.util.stream.Collectors.groupingBy(String::length));
        System.out.println(groupedByLen);
        // {3=[Bob], 4=[John, Jane], 5=[Alice], 7=[Charlie]}


    }
}
