package handleerror;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int input1 = Integer.parseInt(sc.nextLine());
            int input2 = Integer.parseInt(sc.nextLine());
            int ans = input1 / input2;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println("Internal server error");
            //
        } finally {
            // ไม่ว่าจะเกิด Exception หรือไม่ โปรแกรมนี้ก็จะทำงาน
            System.out.println("Complete divide program");
        }
    }
}
