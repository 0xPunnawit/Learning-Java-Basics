package sorting;

import java.util.Arrays;
import java.util.List;

public class Util {

    // แปลงจาก List<Integer> ให้เป็น int[] เพื่อใช้งานกับ algorithm ที่ใช้ primitive array
    public static int[] listToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i); // ดึงค่าจาก list มาเก็บใน array
        }
        return array;
    }

    // สลับค่าระหว่างตำแหน่ง i และ j ใน array
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
