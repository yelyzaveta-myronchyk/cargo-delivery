package com.cargodelivery.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @Column(nullable = false)
    private int zipCode;
    @Column(nullable = false, length = 15)
    private String country;
    @Column(nullable = false, length = 30)
    private String city;
    @Column(nullable = false, length = 30)
    private String street;
    @Column(nullable = false)
    private String houseNumber;


    public Address(String country, String city, String street, String houseNumber, int zipCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }
    public Address(){}
    public void setCountry(String country) {

        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String toString() {
        return "Country\t" + getCountry() + "\nCity \t" + getCity() + "\nStreet\t" + getStreet() + "\nHause Number\t" + getHouseNumber() + "\nZipcode\t" + getZipCode() + "\n";
    }
}
