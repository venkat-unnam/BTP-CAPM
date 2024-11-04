package com.venkatunnam.dbboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressPersistence extends JpaRepository<Address, String> {

}
