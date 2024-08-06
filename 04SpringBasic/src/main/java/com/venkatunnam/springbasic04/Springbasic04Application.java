package com.venkatunnam.springbasic04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.venkatunnam.springbasic04.classes.Laptop;

@SpringBootApplication
public class Springbasic04Application {

	public static void main(String[] args) {
		// return obj of ConfigurableApplicationContext
		// get the memory object of spring context in which all objects lie
		ConfigurableApplicationContext context = SpringApplication.run(Springbasic04Application.class, args);

		// ask spring framework to craete object - using getbean method
		Laptop appleA8 = context.getBean(Laptop.class, null); // null - pass when constructor has parameters
		// set attributes
		appleA8.setBrand("Apple");
		appleA8.setLength(10);
		appleA8.setWidth(20);
		appleA8.bootLaptop();
		System.out.println(appleA8.toString());

		// instantiation of another object
		Laptop lenovoM15 = context.getBean(Laptop.class, null);
		lenovoM15.setBrand("Lenovo");
		lenovoM15.setLength(10);
		lenovoM15.setWidth(20);
		lenovoM15.bootLaptop();
		System.out.println(lenovoM15.toString());
		// self managing/creating object - not advisable
		// Laptop appleA8 = new Laptop();
		// datatype object_variable = new class_name - syntax for creating obj
	}
}
