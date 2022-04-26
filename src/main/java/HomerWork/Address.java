package HomerWork;

import java.util.Objects;

public class Address {
    private String city;
    private String country;
    private String street;
    private String postal_Code;

    Address(){}
    public Address(String city, String country, String street, String postal_Code) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.postal_Code = postal_Code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostal_Code() {
        return postal_Code;
    }

    public void setPostal_Code(String postal_Code) {
        this.postal_Code = postal_Code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) && Objects.equals(country, address.country) &&
                Objects.equals(street, address.street) && Objects.equals(postal_Code, address.postal_Code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, country, street, postal_Code);
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", postal_Code='" + postal_Code + '\'' +
                '}';
    }
}
