package socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

    // Method สำหรับเชื่อมต่อไปยัง Server
    public void connect(final String host, final int port, final Scanner sc) {
        try (var socket = new Socket(host, port)) {  // สร้าง Socket เชื่อมต่อไปยัง Server
            System.out.println("Establish connection");

            // สร้าง PrintWriter สำหรับการส่งข้อมูลไปยัง Server
            var writer = new PrintWriter(socket.getOutputStream(), true);

            // สร้าง BufferedReader สำหรับอ่านข้อมูลจาก Server
            var reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String userInput;
            while (true) {
                System.out.print("Input: ");
                userInput = sc.nextLine();  // รับข้อมูลจากผู้ใช้
                if (userInput.isEmpty()) {  // ถ้าผู้ใช้ไม่ป้อนข้อความ ให้หยุด
                    break;
                }
                writer.println(userInput);  // ส่งข้อมูลที่ป้อนไปยัง Server

                // รับ response จาก Server
                String serverResponse = reader.readLine();
                System.out.println("Server response: " + serverResponse);  // แสดงผล response จาก Server
            }
        } catch (Exception e) {  // หากเกิดข้อผิดพลาดในการเชื่อมต่อ
            System.out.println("Connection closed");
            throw new RuntimeException(e);
        }
    }
}
