package oop.association;

public class Address {

    private String City;
    private String postalCode;

    public Address(String city, String postalCode) {
        City = city;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
