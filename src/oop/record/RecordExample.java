package oop.record;

import java.math.BigDecimal;

public class RecordExample {

    public static void main(String[] args) {

        // POJO
        Product p1 = new Product("macbook", "electronic", new BigDecimal(1000), "apple");
        System.out.println(p1);

        // Record
        ProductRecord p2 = new ProductRecord("laptop", "electronic", new BigDecimal(500), "lenovo");
        System.out.println(p2); // Implemented toString already
        System.out.println(p2.name());  // customized behavior
        System.out.println(p2.type());  // default behavior
        System.out.println(p2.giveMeStoreName());   // Use static on record class


        System.out.println(p1.equals(p2));

    }

}
