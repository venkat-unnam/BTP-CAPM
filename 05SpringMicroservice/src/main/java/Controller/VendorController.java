package Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import Bean.Vendor;
import VendorService.VendorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// want microservice use @RestController
// want spring to manage object use @Component

@SuppressWarnings("unused")
@RestController // used to make microservice
public class VendorController {

    @Autowired
    private VendorService myVendorSrv;

    @RequestMapping("/vendors")
    public HashMap<String, Vendor> getAll() {
        return myVendorSrv.getAllVendors();
    }
}
