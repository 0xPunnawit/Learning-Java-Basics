package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DoublyLinkedList {

    public static void main(String[] args) {

        var linkedList = new DoublyLinkList();
        linkedList.traverseLinkedList();
        linkedList.insertHead(new ListNode<>("W"));
        linkedList.traverseLinkedList();                        // OUTPUT: W
        linkedList.insertHead(new ListNode<>("A"));
        linkedList.traverseLinkedList();                        // OUTPUT: A->W
        linkedList.insertTail(new ListNode<>("S"));
        linkedList.traverseLinkedList();                        // OUTPUT: A->W->S
        System.out.println(linkedList.deleteHead());
        linkedList.traverseLinkedList();                        // OUTPUT: W->S
        System.out.println(linkedList.deleteHead());
        System.out.println(linkedList.deleteHead());
        System.out.println("=================================");

        linkedList.insertHead(new ListNode<>("G"));
        linkedList.insertHead(new ListNode<>("N"));
        linkedList.insertHead(new ListNode<>("I"));
        linkedList.traverseLinkedList();                        // OUTPUT: I->N->G
        System.out.println(linkedList.deleteBetween("N"));
        linkedList.traverseLinkedList();                        // OUTPUT: I->G

    }

    public static class DoublyLinkList {
        public ListNode<String> head;                           // ตัวชี้ไปยัง Node แรก
        public ListNode<String> tail;                           // ตัวชี้ไปยัง Node สุดท้าย
        public int size = 0;

        public DoublyLinkList() {
            this.head = new ListNode<String>("HEAD");      // สร้าง Node แรก
            this.tail = new ListNode<String>("TAIL");      // สร้าง Node สุดท้าย

            // Connect head and tail
            this.head.next = this.tail;                         // ชี้ไปยัง Node สุดท้าย
            this.tail.prev = this.head;                         // ชี้ไปยัง Node แรก
        }

        // insert head
        public void insertHead(ListNode<String> newNode) {
            var nextHead = this.head.next;                      // เก็บตัวชี้ไปยัง Node ถัดไป
            newNode.next = nextHead;                            // เชื่อม newNode ไปยัง Node ถัดไป
            nextHead.prev = newNode;                            // เชื่อม Node ถัดไปไปยัง newNode
            this.head.next = newNode;                           // เชื่อม head ไปยัง newNode
            newNode.prev = this.head;                           // เชื่อม newNode ไปยัง head
            this.size++;
        }

        // insert tail
        public void insertTail(ListNode<String> newNode) {
            var prevTail = this.tail.prev;                      // เก็บตัวชี้ไปยัง Node ก่อนหน้า
            prevTail.next = newNode;                            // เชื่อม Node ก่อนหน้าไปยัง newNode
            newNode.prev = prevTail;                            // เชื่อม newNode ไปยัง Node ก่อนหน้า
            newNode.next = this.tail;                           // เชื่อม newNode ไปยัง tail
            this.tail.prev = newNode;                           // เชื่อม tail ไปยัง newNode
            this.size++;
        }

        // traverse
        private void traverseLinkedList() {
            List<String> traverResult = new ArrayList<>();
            var ignoreDataSet = Set.of("HEAD", "TAIL");         // ข้อมูลที่ไม่ต้องการ
            var currNode = head;                                // เริ่มต้นจาก head
            while (currNode != null) {
                if (!ignoreDataSet.contains(currNode.data)) {
                    traverResult.add(currNode.data);            // เก็บข้อมูลใน List
                }
                currNode = currNode.next;                       // เลื่อน currNode ไปที่ Node ถัดไป
            }
            var result = String.join("->", traverResult);
            System.out.println(result);
        }

        // delete head
        public ListNode<String> deleteHead() {
            if (this.size == 0) {
                return null;
            }

            var nextHea = this.head.next;                       // เก็บตัวชี้ไปยัง Node ถัดไป
            var nextHead = this.head.next;                  // เก็บตัวชี้ไปยัง Node ถัดไป
            this.head.next = nextHead.next;                 // เชื่อม head ไปยัง Node ถัดไป
            nextHead.next.prev = this.head;                 // เชื่อม Node ถัดไปไปยัง head
            nextHead.next = null;
            nextHead.prev = null;
            this.size--;
            return nextHead;
        }

        // delete tail
        public ListNode<String> deleteTail() {
            if (this.size == 0) {
                return null;
            }

            var prevTail = this.tail.prev;                  // เก็บตัวชี้ไปยัง Node ก่อนหน้า
            this.tail.prev = prevTail.prev;                 // เชื่อม tail ไปยัง Node ก่อนหน้า
            prevTail.prev.next = this.tail;                 // เชื่อม Node ก่อนหน้าไปยัง tail
            prevTail.next = null;
            prevTail.prev = null;
            this.size--;
            return prevTail;
        }


        // delete between
        public ListNode<String> deleteBetween(String target) {
            ListNode<String> prev = head;
            ListNode<String> curr = head.next;
            while (curr != null) {
                if (curr.data.equals(target)) {
                    prev.next = curr.next;                      // เชื่อม Node ก่อนหน้าไปยัง Node ถัดไป
                    curr.next.prev = prev;                      // เชื่อม Node ถัดไปไปยัง Node ก่อนหน้า
                    curr.next = null;                           // Node ที่ถูกลบไม่ชี้ไปไหน
                    curr.prev = null;
                    this.size--;
                    return curr;
                }
                prev = curr;                                    // เลื่อน prev ไปที่ Node ปัจจุบัน
                curr = curr.next;                               // เลื่อน curr ไปที่ Node ถัดไป
            }

            return null;
        }

    }

    private static class ListNode<T> {
        public T data;                                          // ข้อมูลใน Node
        public ListNode<T> next;                                // ตัวชี้ไปยัง Node ถัดไป
        public ListNode<T> prev;                                // ตัวชี้ไปยัง Node ก่อนหน้า

        public ListNode(T data) {
            this.data = data;
        }

        public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Remove: [" + this.data + "]";
        }
    }
}
