package stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        // สร้าง List ของ Integer (Wrapper class)
        List<Integer> integerList = List.of(1, 3, 5, 7, 6, 2, 34, 25, 44, 99);

        Stream<Integer> integerStream = integerList.stream();   // แปลง List เป็น Stream

        // - map(n -> n * 2)     : แปลงค่าแต่ละ element ให้คูณด้วย 2
        // - filter(n -> n % 10 == 0) : คัดเอาเฉพาะค่าที่หาร 10 ลงตัว
        // - toList()            : เก็บผลลัพธ์กลับมาเป็น List ใหม่
        var result = integerStream
                .map(n -> n * 2)
                .filter(n -> n % 10 == 0)
                .toList();

        // Output จะเป็น [10, 50] เพราะ:
        // 1 * 2 = 2
        // 3 * 2 = 6
        // 5 * 2 = 10
        // 7 * 2 = 14
        // 6 * 2 = 12
        // 2 * 2 = 4
        // 34 * 2 = 68
        // 25 * 2 = 50
        // 44 * 2 = 88
        // 99 * 2 = 198
        System.out.println(result);

// ============================================================================

        // Alternative: ใช้ IntStream (primitive stream)
        var intStream = IntStream.of(1, 3, 5, 7, 6, 2, 34, 25, 44, 99);
        var avg = intStream.average()
                .orElseThrow(() -> new RuntimeException("Cannot calculate average"));
        System.out.println(avg);    // Output 22.6


        var fruitStream = Stream.of("apple", "banana", "cherry", "apple", "orange", "banana", "apple");
        var countFrequency = fruitStream.collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(countFrequency); // Output {orange=1, banana=2, cherry=1, apple=3}

    }



}
