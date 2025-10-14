package dsa.basic.list;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();

        customers.add("AAA");
        customers.add("BBB");
        customers.add("CCC");

        System.out.println(customers);          // [AAA, BBB, CCC]

        System.out.println(customers.get(0));   // AA

        System.out.println(customers.get(1));   // BBB

        System.out.println(customers.size());   // 3

        System.out.println(customers.remove(0));    // AAA

        System.out.println(customers);          // [BBB, CCC]
    }

}
