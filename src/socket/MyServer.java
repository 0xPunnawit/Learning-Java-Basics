package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class MyServer {

    // Method สำหรับเริ่มต้น Server
    public void start(final int port) {
        try (var serverSocket = new ServerSocket(port)) {  // สร้าง ServerSocket ที่พอร์ตที่กำหนด
            System.out.println("Server started on port: " + port);
            var client = serverSocket.accept();  // รอการเชื่อมต่อจาก Client
            var clientAddress = client.getInetAddress().getHostAddress();  // ที่อยู่ IP ของ Client
            var clientPort = client.getPort();  // พอร์ตที่ Client ใช้
            System.out.println("Client connected from: " + clientAddress + ":" + clientPort);

            // รับข้อมูลจาก Client
            var clientInput = new BufferedReader(new InputStreamReader(client.getInputStream()));
            var clientOutput = new PrintWriter(client.getOutputStream(), true);  // สำหรับส่งข้อมูลกลับไปที่ Client
            String input;
            // อ่านข้อมูลจาก Client และแสดงผล
            while ((input = clientInput.readLine()) != null) {
                System.out.println(clientAddress + ":" + clientPort + ": " + input);
                if (input.isEmpty()) {  // หากข้อความว่าง ให้หยุดการรับข้อมูล
                    break;
                }

                // ส่งข้อความตอบกลับไปยัง Client
                String response = "Server received: " + input;
                clientOutput.println(response);  // ส่งข้อมูลตอบกลับ
            }
        } catch (IOException e) {  // หากเกิดข้อผิดพลาดในการเชื่อมต่อ
            System.out.println("Socket server is shutdown!!");
            throw new RuntimeException(e);
        }
    }
}
