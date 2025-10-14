package dsa.basic.list;

import java.util.LinkedList;

public class BasicLinkedList {

    public static void main(String[] args) {
        LinkedList<String> customers = new LinkedList<>();
        customers.add("AAA");
        customers.add("BBB");
        customers.add("CCC");

        System.out.println(customers);          // [AAA, BBB, CCC]

        System.out.println(customers.get(0));   // AAA

        System.out.println(customers.get(1));   // BBB

        customers.addFirst("ZZZ");
        System.out.println(customers);          // [ZZZ, AAA, BBB, CCC]

        customers.addLast("XXX");
        System.out.println(customers);          // [ZZZ, AAA, BBB, CCC, XXX]

        customers.remove(0);              // Remove index 0 -> ZZZ
        System.out.println(customers);          // [AAA, BBB, CCC, XXX]

        customers.add(2, "HHH");
        System.out.println(customers);          // [AAA, BBB, HHH, CCC, XXX]

    }

}
