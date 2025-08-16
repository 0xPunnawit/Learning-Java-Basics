package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        // สร้าง array จาก List โดยใช้ Util.listToIntArray
        var array = Util.listToIntArray(List.of(26, 8, 54, 37, 12, 78));

        // ============== Quadratic time Complexity: O(n^2) ==============
        // เรียก insertion sort บน array ที่ถูก clone เพื่อป้องกันการแก้ไข array ต้นฉบับ
        System.out.println("Original array: " + Arrays.toString(array));
        insertionSortExample(cloneArray(array));
        System.out.println();

        System.out.println("Original array: " + Arrays.toString(array));
        selectionSortExample(cloneArray(array));
        System.out.println();

        System.out.println("Original array: " + Arrays.toString(array));
        bubbleSortExample(cloneArray(array));
        System.out.println();

        // ============== Linear time Complexity: O(n) ==============
        System.out.println("Original array: " + Arrays.toString(array));
        quickSortExample(cloneArray(array));
        System.out.println();
//        mergeSortExample(cloneArray(array));
//        System.out.println();

    }

    // สร้างสำเนา array ใหม่ (deep copy) เพื่อป้องกันการแก้ไขของ array เดิม
    private static int[] cloneArray(int[] array) {
        return Arrays.copyOfRange(array, 0, array.length);
    }

    // จัดเรียงข้อมูลแบบ Insertion Sort
    private static void insertionSortExample(int[] array) {
        // เริ่มจาก index 1 เพราะ index 0 มีค่าเดียวอยู่แล้วถือว่าเรียงแล้ว
        for (int i = 1; i < array.length; i++) {
            var j = i;
            // เลื่อนค่าไปทางซ้ายจนกว่าค่าจะอยู่ในตำแหน่งที่ถูกต้อง
            while (j > 0 && array[j] < array[j - 1]) {
                Util.swap(array, j, j - 1); // สลับตำแหน่ง
                j--; // เลื่อนตัวเปรียบเทียบไปทางซ้าย
            }
        }
        // แสดงผลลัพธ์หลังการ sort
        System.out.println("Insertion Sort: " + Arrays.toString(array));
    }

    // จัดเรียงข้อมูลแบบ Selection Sort
    private static void selectionSortExample(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            int largestIndex = 0;
            for (int j = 0; j <= i; j++) {
                if (array[j] > array[largestIndex]) {
                    largestIndex = j;
                }
            }
            Util.swap(array, i, largestIndex);
        }
        System.out.println("Selection Sort: " + Arrays.toString(array));
    }

    // จัดเรียงข้อมูลแบบ Bubble Sort
    private static void bubbleSortExample(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            // i => consideration index
            // j => bubble value
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Util.swap(array, j, j + 1);
                }
            }



        }

        System.out.println("Bubble Sort: " + Arrays.toString(array));
    }

    private static void quickSortExample(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int partitionIndex = findPartitionIndex(array, left, right);
            // Left
            quickSort(array, left, partitionIndex - 1);
            // Right
            quickSort(array, partitionIndex + 1, right);
        }
    }

    private static int findPartitionIndex(int[] array, int left, int right) {
        int pivotIndex = left;
        int leftPointer = pivotIndex + 1;
        int rightPointer = right;
        // Do until it's cross
        while (leftPointer <= rightPointer) {
            while (leftPointer <= right && array[leftPointer] < array[pivotIndex]) {
                leftPointer++;
            }
            while (leftPointer <= rightPointer && array[rightPointer] > array[pivotIndex]) {
                rightPointer--;
            }
            if (leftPointer < rightPointer) {
                Util.swap(array, leftPointer, rightPointer);

            }
        }
        Util.swap(array, pivotIndex, rightPointer);
        return rightPointer;
    }

    private static void mergeSortExample(int[] array) {


        System.out.println("Merge Sort: " + Arrays.toString(array));
    }


}
