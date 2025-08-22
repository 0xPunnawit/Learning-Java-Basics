package practice;

public class MathExample {

    public static void main(String[] args) {

        // Absolute - distance from zero
        System.out.println(Math.abs(-5));   // Output: 5

        // sin, cos, tan, cosec, sec, cot
        System.out.println(Math.sin(Math.toRadians(45)));   // Output: 1

        // Power
        System.out.println(Math.pow(2, 3)); // Output: 8 (2^3)

        // Square root
        System.out.println(Math.sqrt(25));  // Output: 5 (sqrt(25))

        // Compare
        System.out.println(Math.min(2, 3)); // Output: 2
        System.out.println(Math.max(2, 3)); // Output: 3

        // round -> ปัดขึ้น  มากกว่า 0.5 ปัดขึ้น,  น้อยกว่า  0.5 ปัดลง
        System.out.println(Math.round(2.5)); // Output: 2.0
        System.out.println(Math.round(2.45)); // Output: 2.0

        // floor -> ปัดลง
        System.out.println(Math.floor(2.5)); // Output: 2.0
        System.out.println(Math.floor(2.45)); // Output: 2.0

        // ceil -> ปัดขึ้น
        System.out.println(Math.ceil(2.5)); // Output: 3.0
        System.out.println(Math.ceil(2.45)); // Output: 3.0

        // Pi
        System.out.println(Math.PI);    // 3.141592653589793

    }
}
