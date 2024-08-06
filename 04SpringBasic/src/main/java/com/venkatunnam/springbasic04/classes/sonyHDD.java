package com.venkatunnam.springbasic04.classes;

import org.springframework.stereotype.Component;

@Component // this annotation registers the class with spring framework to create object
           // automatically
public class sonyHDD implements IHarddisk {
    @Override
    public void startHDD() {
        System.out.println("Sony Harddisk started");
    };

    @Override
    public void readHDD() {
        System.out.println("Sony Harddisk reading at 10GBPS");
    };
}
