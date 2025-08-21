package socket;

import java.util.Scanner;

public class SocketExample {

    private static final int PORT = 8080;  // กำหนดพอร์ตที่ใช้ในการเชื่อมต่อ
    private static final String HOST = "localhost";  // กำหนดที่อยู่ของ Server

    public static void main(String[] args) {
        // แสดงตัวเลือกให้ผู้ใช้เลือกว่าจะรัน Server หรือ Client
        System.out.println("""
                Server: 1
                Client: 2
                """);
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());  // รับตัวเลือกจากผู้ใช้

        // เลือกทำงานตามที่ผู้ใช้เลือก
        switch (choice) {
            case 1 -> new MyServer().start(PORT);  // ถ้าผู้ใช้เลือก 1 ให้เริ่ม Server
            case 2 -> new MyClient().connect(HOST, PORT, sc);  // ถ้าผู้ใช้เลือก 2 ให้เชื่อมต่อ Client
            default -> throw new IllegalStateException("Unexpected value: " + choice);  // หากเลือกค่าที่ไม่ถูกต้อง
        }
    }
}
