package com.venkatunnam.dbboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController // used to make microservice
public class VendorController {

    @Autowired
    private VendorService myVendorSrv;

    // like GET_ENTITY_SET
    // localhost:8080/vendors
    @RequestMapping("/vendors")
    public List<Vendor> getAll() {
        return myVendorSrv.getAllVendors();
    }

    // like CREATE_ENTITY
    // localhost:8080/vendors
    @PostMapping("/vendors")
    public Vendor createVendor(@RequestBody Vendor myVendor) {
        System.out.println(myVendor);
        return myVendorSrv.createVendor(myVendor);
    }

    // like GET_ENTITY
    // localhost:8080/vendors/1234 (key to be read)
    @RequestMapping("/vendors/{vendorCode}")
    public Optional<Vendor> getVendorBYId(@PathVariable("vendorCode") String code) {
        return myVendorSrv.readVendorById(code);
    }

    // like UPDATE_ENTITY
    // localhost:8080/vendor/1234
    @RequestMapping(method = RequestMethod.PUT, value = "/vendor/{vendorId}")
    public Vendor updateVendor(@PathVariable("vendorId") String vendorCode,
            @RequestBody Vendor vendor) {
        return myVendorSrv.changeVendor(vendorCode, vendor);
    }

    // like DELETE_ENTITY
    // localhost:8080/vendor/1234
    @RequestMapping(value = "/vendor/{vendorId}", method = RequestMethod.DELETE)
    public String deleteVendor(@PathVariable("vendorId") String vendorCode) {
        return myVendorSrv.deleteVendor(vendorCode);
    }

    // localhost:8080/vendor/search?companyName=Test
    @RequestMapping("/vendor/search")
    public List<Vendor> getVendorsByCompany(@RequestParam String companyName) {
        return myVendorSrv.getCustomerByCompanyName(companyName);
    }

    // localhost:8080/vendor/lookup/gmail
    @RequestMapping("/vendor/lookup/{emailId}")
    public List<Vendor> searchVendorByEmail(@PathVariable("emailId") String emailId) {
        return myVendorSrv.searchCustomerByEmail(emailId);
    }

}
