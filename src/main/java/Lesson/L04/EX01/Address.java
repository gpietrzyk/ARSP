package Lesson.L04.EX01;

import java.util.Objects;

public class Address {
    private String street;
    private String flatNo;
    private String ch;
    private String houseNo;
    private String postalCode;
    private String city;

    public void printAddress(){
        System.out.println(street
                .concat(" ").concat(flatNo).concat(ch).concat(houseNo)
                .concat(" \n").concat(postalCode).concat(" ").concat(city));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(getStreet(), address.getStreet()) &&
                Objects.equals(getFlatNo(), address.getFlatNo()) &&
                Objects.equals(getCh(), address.getCh()) &&
                Objects.equals(getHouseNo(), address.getHouseNo()) &&
                Objects.equals(getPostalCode(), address.getPostalCode()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getStreet(), getFlatNo(), getCh(), getHouseNo(), getPostalCode(), getCity());
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


    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
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
