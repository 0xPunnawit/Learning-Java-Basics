package dsa.recursion;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class DpExample {

    public static void main(String[] args) {
        int n = 190;

        // เรียกใช้งาน bottom-up
        // Fibonacci ของ 50 คือ: 12586269025
        //Bottom-Up Execution time: 9 ms
//        Instant start = Instant.now();
//        bottomUpExample(n);
//        Instant end = Instant.now();
//        Duration duration = Duration.between(start, end);
//        System.out.println("Bottom-Up Execution time: " + duration.toMillis() + " ms");
//
//        System.out.println();  // เว้นบรรทัดระหว่างการทดสอบ

        // เรียกใช้งาน top-down (Memoization)
        // ผลลัพธ์ -> Fibonacci (Top-Down): 12586269025
        //Top-Down Execution time: 7 ms
        Instant start = Instant.now();
        recursiveExampleTopDown(n);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Top-Down Execution time: " + duration.toMillis() + " ms");
    }

    // ฟังก์ชัน Fibonacci แบบ Top-Down ใช้ Memoization
    private static void recursiveExampleTopDown(int n) {
        Map<Integer, Long> memo = new HashMap<>();
        long fibonacciResult = fibonacci(n, memo);
        System.out.println("\nผลลัพธ์ -> Fibonacci (Top-Down): " + fibonacciResult);
    }

    // ฟังก์ชัน Fibonacci แบบ Bottom-Up ใช้ Tabulation
    private static void bottomUpExample(int n) {
        long[] dp = new long[n + 1];

        // กำหนดค่าเริ่มต้น
        dp[0] = 0;  // Fibonacci ของ 0 คือ 0
        dp[1] = 1;  // Fibonacci ของ 1 คือ 1

        // ใช้ Tabulation คำนวณ Fibonacci ตั้งแต่ 2 ถึง n
        for (int state = 2; state <= n; state++) {
            dp[state] = dp[state - 1] + dp[state - 2];
        }

        System.out.println("Fibonacci ของ " + n + " คือ: " + dp[n]);
    }

    // ฟังก์ชัน Fibonacci แบบ Top-Down ใช้ Memoization
    private static long fibonacci(int n, Map<Integer, Long> memo) {
        // Base case
        if (n <= 1) {
            return n;
        }

        // ตรวจสอบว่ามีค่า Fibonacci ที่คำนวณแล้วใน memo หรือไม่
        if (memo.containsKey(n)) {
            return memo.get(n);  // ถ้ามีค่าอยู่ใน memo, คืนค่าทันที
        }

        // คำนวณ Fibonacci โดยเรียกฟังก์ชันซ้ำ (recurse)
        long result = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        // เก็บผลลัพธ์ใน memo เพื่อใช้ในครั้งถัดไป
        memo.put(n, result);

        return result;
    }
}
