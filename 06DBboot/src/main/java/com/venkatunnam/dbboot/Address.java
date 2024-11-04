package com.venkatunnam.dbboot;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // spring jpa can read this entity and entity manager factory class can craete
        // db table for it
public class Address {
    @SuppressWarnings("deprecation")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, name = "ID")
    private String addressId;
    @Column(name = "TYPE")
    private String addressType;
    @Column(name = "STREET")
    private String street;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "REGION")
    private String region;

    public Address() { // create an empty constructor

    }

    // generate constructor
    public Address(String addressId, String addressType, String street, String city, String country, String region) {
        this.addressId = addressId;
        this.addressType = addressType;
        this.street = street;
        this.city = city;
        this.country = country;
        this.region = region;
    }

    // generate getters and setters
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
