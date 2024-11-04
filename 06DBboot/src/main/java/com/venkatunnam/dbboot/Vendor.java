package com.venkatunnam.dbboot;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Component
@Scope("prototype") // allows multiple memory areas for mulatiple objects, by default it is
                    // singleton so even multiple objects instantiated nly one obj is stored during
                    // autowire
@Entity
@Table
public class Vendor {
    @SuppressWarnings("deprecation")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, name = "ID")
    private String code;
    @Column(nullable = false, name = "COMPANY_NAME")
    private String companyName;
    @Column(nullable = false, name = "CONTACT_PERSON")
    private String contactPerson;
    @Column(nullable = false, name = "FIRST_NAME")
    private String firstName;
    @Column(nullable = false, name = "LAST_NAME")
    private String lastName;
    @Column(nullable = false, name = "WEBSITE")
    private String website;
    @Column(nullable = false, name = "EMAIL")
    private String email;
    @Column(nullable = false, name = "STATUS")
    private int status;
    @Column(nullable = false, name = "REG_DATE")
    private Date regDate;

    // to create association
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor", referencedColumnName = "ID")
    private List<Address> addresses = new ArrayList<Address>();

    // default constructor
    public Vendor() {
        this.code = "123";
        this.companyName = "ABC Company";
        this.contactPerson = "Venkat Unnam";
        this.firstName = "Venkat";
        this.lastName = "Unnam";
        this.website = this.companyName + ".com";
        this.email = this.firstName + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date(status);
    }

    // generated constructor
    public Vendor(String code, String companyName, String contactPerson, String firstName, String lastName) {
        this.code = code;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.website = this.companyName + ".com";
        this.email = this.firstName + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date(status);
    }

    // generated setters and getters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
