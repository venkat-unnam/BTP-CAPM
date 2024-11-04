package com.venkatunnam.dbboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class AddressController {
    @Autowired
    AddressService addressSrv;

    @RequestMapping("/addresses")
    public List<Address> getAddresses() {
        return addressSrv.getAdresses();
    }

    @RequestMapping("/address/{addressId}")
    public Optional<Address> getAddress(@PathVariable("addressId") String addressId) {
        return addressSrv.getAddress(addressId);
    }

    @PostMapping("/address")
    public Address creatAddress(@RequestBody Address addressData) {
        return addressSrv.createAddress(addressData);
    }
}
