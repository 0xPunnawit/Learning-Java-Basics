package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Singly_Linked {

    public static void main(String[] args) {
//        PNWJV สร้าง linked list
        var head = new ListNode<>("HEAD");
        var pNode = new ListNode<>("P");
        var nNode = new ListNode<>("N");
        var wNode = new ListNode<>("W");
        var jNode = new ListNode<>("J");
        var vNode = new ListNode<>("V");

//        เชื่อมโยงแต่ละ Node (กำหนด next ของแต่ละ Node)
        head.next = pNode;
        pNode.next = nNode;
        nNode.next = wNode;
        wNode.next = jNode;
        jNode.next = vNode;
        System.out.println(traverseLinkedList(head.next));  // OUTPUT: HEAD->P->N->W->J->V

//        สร้าง Node ใหม่ ที่ชื่อ A และเชื่อมกับ Node N
        var aNode = new ListNode<>("A");
        insertNext(nNode, aNode);
        System.out.println(traverseLinkedList(head.next));  // OUTPUT: HEAD->P->N->A->W->J->V

//        สร้าง Node ใหม่ ที่ชื่อ X และเชื่อมกับ Node J
        var xNode = new ListNode<>("X");
        insertBySearching(aNode, "J", xNode);
        System.out.println(traverseLinkedList(head.next));  // OUTPUT: HEAD->P->N->A->W->J->X->V

//        ลบ Node ที่ชื่อ A
        deleteNode(head.next, "A");
        System.out.println(traverseLinkedList(head.next));  // OUTPUT: HEAD->P->N->W->J->X->V

    }

    private static void deleteNode(ListNode<String> head, String targetData) {
        ListNode<String> prev = head;                       //  ตัวชี้ไปยัง Node ก่อนหน้า
        ListNode<String> curr = head.next;                  // ตัวชี้ไปยัง Node ปัจจุบัน
        while (curr != null) {
            if (curr.data.equals(targetData)) {
                prev.next = curr.next;                      // เชื่อมโยง Node ก่อนหน้าไปยัง Node ถัดไป
                curr.next = null;                           // Node ที่ถูกลบไม่ชี้ไปไหน
                return;
            }
            prev = curr;                                    // เลื่อน prev ไปที่ Node ปัจจุบัน
            curr = curr.next;                               // เลื่อน curr ไปที่ Node ถัดไป
        }
    }

    private static void insertBySearching(ListNode<String> head, String searchTarget, ListNode<String> newNode) {
        var currNode = head;
        while (currNode != null) {
            if (currNode.data.equals(searchTarget)) {
                insertNext(currNode, newNode);              // แทรก Node ใหม่หลัง Node ปัจจุบัน
            }
                currNode = currNode.next;                   // เลื่อน currNode ไปที่ Node ถัดไป
        }
    }

    private static void insertNext(ListNode<String> target, ListNode<String> newNode) {
        ListNode<String> tmp = target.next;                 // เก็บตัวชี้ไปยัง Node ถัดไป
        target.next = newNode;                              // เชื่อม target ไปยัง newNode
        newNode.next = tmp;                                 // เชื่อม newNode ไปยัง Node ถัดไปที่เก็บไว้ใน tmp
    }

    private static String traverseLinkedList(ListNode<String> head) {
        List<String> traverResult = new ArrayList<>();
        var currNode = head;                                // เริ่มต้นจาก head
        while (currNode != null) {
            traverResult.add(currNode.data);                // เก็บข้อมูลใน List
            currNode = currNode.next;                       // เลื่อน currNode ไปที่ Node ถัดไป
        }
        return String.join("->", traverResult);     // ส่งคืนข้อมูลที่เก็บใน List โดยเชื่อมข้อมูลแต่ละตัวด้วย "->"
    }

    private static class ListNode<T> {
        public T data;                                      // ข้อมูลใน Node
        public ListNode<T> next;                            // ตัวชี้ไปยัง Node ถัดไป

        public ListNode(T data) {
            this.data = data;
        }

        public ListNode(T data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
