package dsa.basic.list;

import java.util.ArrayList;

public class BasicArrayList {

    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<>();

        customers.add("AAA");
        customers.add("BBB");

        System.out.println(customers);

        System.out.println(customers.get(0));

        System.out.println(customers.get(1));
    }

}
