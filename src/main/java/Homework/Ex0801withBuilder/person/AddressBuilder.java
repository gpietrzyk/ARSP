package Homework.Ex0801withBuilder.person;


public class AddressBuilder {
    private String street;
    private String flatNo;
    private String houseNo;
    private String postalCode;
    private String city;
    private String country;

    public AddressBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public AddressBuilder setFlatNo(String flatNo) {
        this.flatNo = flatNo;
        return this;
    }

    public AddressBuilder setHouseNo(String houseNo) {
        this.houseNo = houseNo;
        return this;
    }

    public AddressBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public AddressBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public AddressBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address build() {
        return new Address(street, flatNo, houseNo, postalCode, city, country);
    }
}
