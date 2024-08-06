package com.venkatunnam.springbasic04.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean (a class is called bean in java)
@Component // this annotatiion registers the class with spring framework to create object
public class Laptop {
    // attributes
    private Integer length;
    private Integer width;
    private String brand;
    @Autowired // annotation for creating object by spring framework automatically
    private IHarddisk harddisk;

    // constructor (void should not be there for constructor)
    public Laptop() { // constructor is created with same name as class
        // harddisk = new sonyHDD(); // tight coupling + we ourself managing the object
        System.out.println("Laptop object got created"); // to print
    }

    @Override
    public String toString() { // prints all properties of class
        return "Laptop [length=" + length + ", width=" + width + ", brand=" + brand + "]";
    }

    public void bootLaptop() {
        harddisk.startHDD();
        System.out.println("Laptop started with brand" + brand);
        harddisk.readHDD();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
