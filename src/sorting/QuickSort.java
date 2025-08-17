package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        // สร้าง array จาก List โดยใช้ Util.listToIntArray (Helper method)
        // ตรงนี้คือการเตรียมข้อมูลที่จะใช้ทดสอบ algorithms
        var array = Util.listToIntArray(List.of(26, 8, 54, 37, 12, 78));

        // ================= Quadratic Time Complexity: O(n^2) =================
        // Insertion Sort
        System.out.println("Original array: " + Arrays.toString(array));
        insertionSortExample(cloneArray(array)); // ใช้ cloneArray ป้องกันการแก้ไข array เดิม
        System.out.println();

        // Selection Sort
        System.out.println("Original array: " + Arrays.toString(array));
        selectionSortExample(cloneArray(array));
        System.out.println();

        // Bubble Sort
        System.out.println("Original array: " + Arrays.toString(array));
        bubbleSortExample(cloneArray(array));
        System.out.println();

        // ================= Logarithmic Time Complexity: O(n log n) =================
        // Quick Sort
        System.out.println("Original array: " + Arrays.toString(array));
        quickSortExample(cloneArray(array));
        System.out.println();

        // Merge Sort
        System.out.println("Original array: " + Arrays.toString(array));
        mergeSortExample(cloneArray(array));
        System.out.println();

    }

    // ทำสำเนาของ array ใหม่ เพื่อให้การ sort แต่ละอันไม่กระทบ array ต้นฉบับ
    private static int[] cloneArray(int[] array) {
        return Arrays.copyOfRange(array, 0, array.length);
    }

    // ================= Insertion Sort =================
    private static void insertionSortExample(int[] array) {
        // เริ่มวนตั้งแต่ index 1 เพราะ index 0 ถือว่าเรียงแล้ว
        for (int i = 1; i < array.length; i++) {
            var j = i;
            // เลื่อนค่าที่ตำแหน่ง j ไปทางซ้าย ถ้าค่าเล็กกว่า element ก่อนหน้า
            while (j > 0 && array[j] < array[j - 1]) {
                Util.swap(array, j, j - 1); // สลับค่าตัวปัจจุบันกับตัวก่อนหน้า
                j--; // เลื่อนไปทางซ้ายต่อ
            }
        }
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }

    // ================= Selection Sort =================
    private static void selectionSortExample(int[] array) {
        // วนจากท้ายไปหน้า
        for (int i = array.length - 1; i >= 0; i--) {
            int largestIndex = 0; // หาค่ามากสุด
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[largestIndex]) {
                    largestIndex = j; // update index ที่มากที่สุด
                }
            }
            // เอาค่ามากสุดมาไว้ตำแหน่งท้าย (i)
            Util.swap(array, i, largestIndex);
        }
        System.out.println("Selection Sort: " + Arrays.toString(array));
    }

    // ================= Bubble Sort =================
    private static void bubbleSortExample(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            // วน bubble ค่าใหญ่ดันไปท้าย array
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swap(array, j, j + 1);
                }
            }
        }
        System.out.println("Bubble Sort: " + Arrays.toString(array));
    }

    // ================= Quick Sort =================
    private static void quickSortExample(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            // หาตำแหน่ง pivot ที่เหมาะสม
            int partitionIndex = findPartitionIndex(array, left, right);
            // จัดเรียงด้านซ้าย pivot
            quickSort(array, left, partitionIndex - 1);
            // จัดเรียงด้านขวา pivot
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private static int findPartitionIndex(int[] array, int left, int right) {
        int pivotIndex = left; // เลือก pivot เป็นตัวแรก
        int leftPointer = pivotIndex + 1;
        int rightPointer = right;

        // วนจนกว่า pointer จะ cross กัน
        while (leftPointer <= rightPointer) {
            // ถ้าค่าทางซ้ายเล็กกว่า pivot ก็เลื่อนไปเรื่อย ๆ
            while (leftPointer <= right && array[leftPointer] < array[pivotIndex]) {
                leftPointer++;
            }
            // ถ้าค่าทางขวามากกว่า pivot ก็เลื่อนมาซ้าย
            while (leftPointer <= rightPointer && array[rightPointer] > array[pivotIndex]) {
                rightPointer--;
            }
            // ถ้า pointer ซ้ายยังน้อยกว่า pointer ขวา → swap
            if (leftPointer < rightPointer) {
                Util.swap(array, leftPointer, rightPointer);
            }
        }
        // สุดท้าย swap pivot ไปอยู่ตำแหน่งที่ถูกต้อง
        Util.swap(array, pivotIndex, rightPointer);
        return rightPointer; // คืนตำแหน่ง pivot ที่ใหม่
    }

    // ================= Merge Sort =================
    private static void mergeSortExample(int[] array) {
        mergeSort(array);
        System.out.println("Merge Sort: " + Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        if (array.length > 1) {
            // หั่น array ออกเป็น 2 ส่วน
            int mid = array.length / 2;
            int[] leftArray = Arrays.copyOfRange(array, 0, mid);
            int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

            // Recursive แยกจนเล็กสุด
            mergeSort(leftArray);
            mergeSort(rightArray);

            // นำ array ที่ถูก sort แล้วมารวมกัน (merge)
            int left = 0;
            int right = 0;
            int writer = 0;

            // merge 2 array ย่อยกลับเข้ามาใน array หลัก
            while (left < leftArray.length && right < rightArray.length) {
                if (leftArray[left] < rightArray[right]) {
                    array[writer] = leftArray[left];
                    left++;
                } else {
                    array[writer] = rightArray[right];
                    right++;
                }
                writer++;
            }

            // เก็บเศษที่เหลือจากฝั่งซ้าย
            while (left < leftArray.length) {
                array[writer++] = leftArray[left++];
            }

            // เก็บเศษที่เหลือจากฝั่งขวา
            while (right < rightArray.length) {
                array[writer++] = rightArray[right++];
            }
        }
    }

}
