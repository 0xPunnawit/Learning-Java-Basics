package oop.association;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<Address> addresses;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
