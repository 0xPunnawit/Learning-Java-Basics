package oop.record;

import java.math.BigDecimal;

// record - special class to String data as immutable
// Backend Java (modern) - Use record to represent data communication schema
public record ProductRecord(

        String name,
        String type,
        BigDecimal price,
        String brand

) {

    // Custom encapsulation behavior
    @Override
    public String name() {
        return "Brand:" + name;
    }

    public static String giveMeStoreName() {
        return "Tech Store";
    }
}
