package dsa.basic.stack;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {

        Stack<String> myStack = new Stack<String>();
        myStack.push("AAA");        // เข้าก่อน แต่ออกทีหลัง index 0
        myStack.push("BBB");        //                  index 1
        myStack.push("CCC");        // เข้าหลังสุด ออกก่อน  index 2

        System.out.println(myStack);        // [AAA, BBB, CCC]
        System.out.println(myStack.get(0)); // AAA
        System.out.println(myStack.get(2)); // C

        myStack.pop();                      // บนสุดออกก่อน pop ออกมาบนสุด
        System.out.println(myStack);        // [AAA, BBB]

        myStack.push("ZZZ");
        System.out.println(myStack.peek()); // check ดูว่า ใครอยู๋บนสุด -> ZZZ
        System.out.println(myStack);        // [AAA, BBB, ZZZ]

        System.out.println(myStack.search("CCC"));  // ไม่มี ไม่เจอค่าข้างใน จะ return -1
        System.out.println(myStack.search("ZZZ"));  // มี return 1 อยู๋บนสุด บนสุดจะเป็น 1
        System.out.println(myStack.search("AAA"));  // มี return 3 อยู่ล่างสุด

        myStack.push("BBB");                      // บนสุดละ index 1
        System.out.println(myStack);                   // [AAA, BBB, ZZZ, BBB]
                                                        //  4    3    2   1
        System.out.println(myStack.search("BBB"));  // return 1 เพราะว่า อยู๋บนสุด search หาตัวไหนเจอก่อน จะ เอาค่านั้นก่อน

        }
}
