package sorting;

import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        // สร้าง array จาก List โดยใช้ Util.listToIntArray
        var array = Util.listToIntArray(List.of(26, 8, 54, 37, 12, 78));

        // ============== Quadratic time Complexity: O(n^2) ==============
        // เรียก insertion sort บน array ที่ถูก clone เพื่อป้องกันการแก้ไข array ต้นฉบับ
        insertionSortExample(cloneArray(array));
        System.out.println();
        selectionSortExample(cloneArray(array));
        System.out.println();
        bubbleSortExample(cloneArray(array));
        System.out.println();
        // ===============================================================

        // ============== Linear time Complexity: O(n) ==============

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


    }

    private static void mergeSortExample(int[] array) {

    }


}
