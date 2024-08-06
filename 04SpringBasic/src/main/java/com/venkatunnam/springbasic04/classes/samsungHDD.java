package com.venkatunnam.springbasic04.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary // this is given priority during object creatin by @Autowired
@Component // this annotation registers the class with spring framework to create object
           // automatically
public class samsungHDD implements IHarddisk {
    @Override
    public void startHDD() {
        System.out.println("Samsung Harddisk started");
    };

    @Override
    public void readHDD() {
        System.out.println("Samsung harddisk raeding at 20GBPS");
    };
}
