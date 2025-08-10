package queue;

import java.util.List;

public class queueDemo {

    public static void main(String[] args) {

        var queue = new OwnQueue();
        var nums = List.of(1, -4, 9, -16, 25);

        // ใช้ enqueue เพื่อเพิ่มข้อมูลลงในคิว
        for (var num : nums) {
            queue.enqueue(num); // เพิ่มค่าในคิว
        }

        // ใช้ dequeue เพื่อดึงข้อมูลออกจากคิวและแสดงผล
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(queue.dequeue()); // ดึงข้อมูลจากคิว
        }
    }

    private static class OwnQueue {
        Node head; // ตัวชี้ไปยัง node แรก (head)
        Node tail; // ตัวชี้ไปยัง node สุดท้าย (tail)


        public OwnQueue() {
            this.head = new Node(0); // สร้าง node แรกเป็นตัว placeholder
            this.tail = new Node(0); // สร้าง node สุดท้ายเป็นตัว placeholder
            head.next = tail; // เชื่อมโยง head ไปที่ tail
            tail.prev = head; // เชื่อมโยง tail ไปที่ head
        }

        // enqueue - เพิ่มข้อมูลเข้าไปที่หัวคิว
        public void enqueue(int data) {
            Node newNode = new Node(data); // สร้าง node ใหม่ที่มีข้อมูล
            Node nextHead = head.next; // หาตำแหน่ง node ถัดไปจาก head
            newNode.next = nextHead; // ให้ node ใหม่ชี้ไปที่ node ถัดไป
            nextHead.prev = newNode; // ให้ node ถัดไปชี้ไปที่ node ใหม่

            head.next = newNode; // เชื่อมโยง node ใหม่ไปที่ head
            newNode.prev = head; // เชื่อมโยง head ไปที่ node ใหม่
        }

        // dequeue - ดึงข้อมูลออกจาก tail
        int dequeue() {
            // ตรวจสอบว่าคิวว่างหรือไม่
            if (this.tail.prev.data == 0) {
                System.out.println("Queue is empty");
                throw new RuntimeException("Queue is empty");
            }
            var prevTail = this.tail.prev; // หาตำแหน่ง node ก่อนหน้า tail
            this.tail.prev = prevTail.prev; // เปลี่ยนตำแหน่ง tail ให้ชี้ไปที่ node ก่อนหน้า prevTail
            prevTail.prev.next = this.tail; // เชื่อมโยง node ก่อนหน้า prevTail ไปที่ tail
            prevTail.next = null; // ทำให้ prevTail ไม่เชื่อมโยงกับข้อมูลใดๆ
            prevTail.prev = null; // ทำให้ prevTail ไม่เชื่อมโยงกับข้อมูลใดๆ
            return prevTail.data; // คืนค่าข้อมูลที่อยู่ใน prevTail
        }

        // peek - ดูข้อมูลที่อยู่ก่อนหน้า tail โดยไม่ดึงออก
        public int peek() {
            if (this.tail.prev.data == 0) {
                System.out.println("Queue is empty");
                throw new RuntimeException("Queue is empty");
            }
            return this.tail.prev.data; // คืนค่าข้อมูลที่อยู่ก่อนหน้า tail
        }
    }

    private static class Node {
        int data; // ข้อมูลใน node
        Node next; // ตัวชี้ไปยัง node ถัดไป
        Node prev; // ตัวชี้ไปยัง node ก่อนหน้า

        Node(int data) {
            this.data = data; // กำหนดค่า data ของ node
        }
    }
}
