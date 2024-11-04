package com.venkatunnam.dbboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorService {
    @Autowired
    private IVendorPersistence vendorDB;

    public List<Vendor> getAllVendors() {
        // findAll - like SELECT *
        return vendorDB.findAll();
    }

    public Optional<Vendor> readVendorById(String vendorId) {
        return vendorDB.findById(vendorId);
    }

    public Vendor createVendor(Vendor newVendor) {
        return vendorDB.save(newVendor);
    }

    public Vendor changeVendor(String vendorId, Vendor vendorData) {
        @SuppressWarnings("unused")
        Optional<Vendor> vendorFound = vendorDB.findById(vendorId);
        return vendorDB.save(vendorData);
    }

    public String deleteVendor(String vendorId) {
        vendorDB.deleteById(vendorId);
        return "Object deleted";
    }

    public List<Vendor> getCustomerByCompanyName(String companyName) {
        return vendorDB.findByCompanyName(companyName);
    }

    public List<Vendor> searchCustomerByEmail(String email) {
        return vendorDB.lookupVendorByEmailId(email);
    }
}
