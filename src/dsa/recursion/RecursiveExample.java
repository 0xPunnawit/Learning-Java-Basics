package dsa.recursion;

public class RecursiveExample {

    public static void main(String[] args) {
        iterativeExample(6);

        System.out.println();

        recursiveExample(6);
    }

    private static void iterativeExample(int n) {
        var result = 1;
        long startTime = System.nanoTime(); // เวลาเริ่มต้นสำหรับ iterative
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        long endTime = System.nanoTime(); // เวลาเสร็จสิ้นสำหรับ iterative
        long durationIterative = endTime - startTime; // คำนวณเวลาที่ใช้
        System.out.println("ผลลัพธ์ -> iterative: " + result);
        System.out.println("เวลาในการคำนวณแบบ Iterative: " + durationIterative + " nanoseconds");
    }

    private static void recursiveExample(int n) {
        long startTime = System.nanoTime(); // เวลาเริ่มต้นสำหรับ recursive
        var result = factorial(n);
        long endTime = System.nanoTime(); // เวลาเสร็จสิ้นสำหรับ recursive
        long durationRecursive = endTime - startTime; // คำนวณเวลาที่ใช้
        System.out.println("ผลลัพธ์ -> recursive: " + result);
        System.out.println("เวลาในการคำนวณแบบ Recursive: " + durationRecursive + " nanoseconds");

        var fibonacciResult = fibonacci(n);
        System.out.println("\nผลลัพธ์ -> fibonacci: " + fibonacciResult);
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int factorial(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        // Recursive case
        return factorial(n - 1) * n;
    }

}
