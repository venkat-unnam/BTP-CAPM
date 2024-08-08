package VendorService;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Bean.Vendor;

@Component
public class VendorService {
    // hashmap - similar to itab in abap, stores data temporarily, stores
    // multiple(array) VENDOR objects
    private HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();

    @Autowired
    private Vendor ven1;
    @Autowired
    private Vendor ven2;
    @Autowired
    private Vendor ven3;

    private void fillVendors() {
        // like append wa to itab
        vendors.put("1", ven1);
        vendors.put("2", ven2);
        vendors.put("3", ven3);
    }

    public VendorService() {
        fillVendors();
    }

    // read all vendors - like returning itab
    public HashMap<String, Vendor> getAllVendors() {
        return vendors;
    }

    // read single vendor by key - like read itab with key
    public Vendor readVendorById(String vendorId) {
        return vendors.get(vendorId);
    }

    // add new record to vendor - like append
    public Vendor addVendor(Vendor newVendor) {
        vendors.put("4", newVendor);
        return newVendor;
    }

    // update
    public Vendor changeVendor(String vendorId, Vendor vendorData) {
        vendors.put(vendorId, vendorData);
        return vendorData;
    }

    // delete
    public void deleteVendor(String vendorId) {
        vendors.remove(vendorId);
    }
}
