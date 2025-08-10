package linkedList;

import java.util.ArrayList;
import java.util.List;

public class CircularLinkedList {

    public static void main(String[] args) {
        // สร้าง CircularLinkedList ใหม่ โดยเริ่มต้นจากการสร้าง Node "A"
        var circularLinkedList = new CircularLinkList(new CircularLinkList.ListNode<>("A"));

        // ทดสอบการแสดงผลลิสต์ 3 ขั้น
        circularLinkedList.traverse(3); // คำสั่งนี้จะลูปแสดงผล 3 ครั้ง

        // เพิ่ม Node ใหม่เข้าไปใน CircularLinkedList
        circularLinkedList.add(new CircularLinkList.ListNode<>("B"));
        circularLinkedList.add(new CircularLinkList.ListNode<>("C"));
        circularLinkedList.add(new CircularLinkList.ListNode<>("D"));
        circularLinkedList.add(new CircularLinkList.ListNode<>("E"));

        // ทดสอบการแสดงผลลิสต์ 10 ขั้น
        circularLinkedList.traverse(10); // คำสั่งนี้จะลูปแสดงผล 10 ครั้ง
    }

    // คลาส CircularLinkList สำหรับจัดการ Circular Linked List
    private static class CircularLinkList {

        // ตัวแปร startNode เก็บ Node เริ่มต้น
        public ListNode<String> startNode;

        // จะเชื่อมโยง startNode ไปที่ตัวเอง (ทำให้มันเป็น Circular)
        public CircularLinkList(ListNode<String> startNode) {
            this.startNode = startNode;
            this.startNode.next = startNode; // ให้ Node ชี้ไปที่ตัวมันเอง
        }

        // getNth ใช้สำหรับการเข้าถึง Node ที่ตำแหน่ง N
        public ListNode<String> getNth(int n) {
            ListNode<String> node = this.startNode;
            for (int i = 0; i < n; i++) {
                node = node.next; // ก้าวไปที่ Node ถัดไป
            }
            return node; // คืนค่าตัว Node ที่ตำแหน่งที่ต้องการ
        }

        // traverse ใช้สำหรับการแสดงผลลิสต์จาก startNode ไปจนถึง Node ที่กำหนด
        private void traverse(int steps) {
            List<String> traverseResult = new ArrayList<>(); // เก็บผลลัพธ์ที่จะแสดงผล
            var currNode = this.startNode; // เริ่มต้นที่ Node แรก
            while (steps-- > 0) { // ลูปทำงานจนกว่าจะครบจำนวน steps ที่กำหนด
                traverseResult.add(currNode.data); // เพิ่มข้อมูลของ Node ที่อยู่ปัจจุบัน
                currNode = currNode.next; // ไปยัง Node ถัดไป
            }
            var result = String.join("->", traverseResult);
            System.out.println(result);
        }

        // add ใช้สำหรับเพิ่ม Node ใหม่เข้าไปใน Circular Linked List
        public void add(ListNode<String> node) {
            node.next = this.startNode.next; // ให้ Node ใหม่ชี้ไปที่ Node ถัดไปของ startNode
            this.startNode.next = node; // ให้ startNode ชี้ไปที่ Node ใหม่
        }

        // คลาส ListNode สำหรับเก็บข้อมูลของแต่ละ Node ในลิสต์
        private static class ListNode<T> {
            public T data;                                          // ข้อมูลใน Node
            public ListNode<T> next;                                // ตัวชี้ไปยัง Node ถัดไป

            public ListNode(T data) {
                this.data = data;
            }

            public ListNode(T data, ListNode<T> next) {
                this.data = data;
                this.next = next;
            }

            @Override
            public String toString() {
                return "Remove: [" + this.data + "]";
            }
        }
    }
}
