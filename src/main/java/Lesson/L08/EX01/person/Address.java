package Lesson.L08.EX01.person;

import java.util.Objects;

public class Address {
    private String street;
    private String flatNo;
    private String houseNo;
    private String postalCode;
    private String city;
    private String country;

    public Address(String street, String flatNo, String houseNo, String postalCode, String city, String country) {
        this.street = street;
        this.flatNo = flatNo;
        this.houseNo = houseNo;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    public void printAddress(){
        System.out.println(street
                .concat(" ").concat(flatNo).concat("/").concat(houseNo)
                .concat(" \n").concat(postalCode).concat(" ").concat(city)
                .concat("\n") .concat(country));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getFlatNo(), address.getFlatNo()) &&
                Objects.equals(getHouseNo(), address.getHouseNo()) &&
                Objects.equals(getPostalCode(), address.getPostalCode()) &&
                Objects.equals(getCity(), address.getCity()) &&
                Objects.equals(country, address.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStreet(), getFlatNo(), getHouseNo(), getPostalCode(), getCity(), country);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
