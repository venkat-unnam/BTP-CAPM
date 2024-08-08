package Bean;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Vendor {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // default constructor
    public Vendor() {
        this.code = "1234";
        this.companyName = "ABC Company";
        this.contactPerson = "Venkat Unnam";
        this.firstName = "Venkat";
        this.lastName = "Unnam";
        this.website = this.companyName + ".com";
        this.email = this.firstName + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
    }

    public Vendor(String code, String companyName, String contactPerson, String firstName, String lastName) {
        this.code = code;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.website = this.companyName + ".com";
        this.email = this.firstName + this.lastName + "@" + this.companyName + ".com";
        this.status = 0;
        this.regDate = new Date();
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

    private String code;
    private String companyName;
    private String contactPerson;
    private String firstName;
    private String lastName;
    private String website;
    private String email;
    private int status;
    private Date regDate;

}
