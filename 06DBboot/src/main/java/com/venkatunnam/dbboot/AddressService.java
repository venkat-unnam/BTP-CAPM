package com.venkatunnam.dbboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressService {
    @Autowired
    IAddressPersistence addressDB;

    public List<Address> getAdresses() {
        return addressDB.findAll();
    }

    public Optional<Address> getAddress(String addressId) {
        return addressDB.findById(addressId);
    }

    public Address createAddress(Address addressData) {
        // rest controller class is for communication all the pre/post checks are
        // recommended to be implemented in service class
        if (addressData.getCountry() == "AU") {
            throw new Error("Cant have Australia address");
        }
        return addressDB.save(addressData);
    }
}
