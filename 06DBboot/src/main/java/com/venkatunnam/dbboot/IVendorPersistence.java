package com.venkatunnam.dbboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//this interface gives the functions to read/write to db

public interface IVendorPersistence extends JpaRepository<Vendor, String> {

    // this interface is responsible for implementing all CRUDQ methods
    // in this we can also add custom functions

    List<Vendor> findByCompanyName(String companyName); // function name is constructed using "findBy" + field name
                                                        // in this function the system automatically creates sql query

    @Query(nativeQuery = true, value = "SELECT * FROM public.vendor WHERE email LIKE '%gmail%'") // schema.table
    List<Vendor> lookupVendorByEmailId(String emailId);
}
