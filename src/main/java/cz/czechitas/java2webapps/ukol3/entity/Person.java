package cz.czechitas.java2webapps.ukol3.entity;

public class Person {
    private String name;
    private String street;
    private String townPostcode;
    private String email;
    private String phone;
    private String web;
    private String company;

    public Person() {
    }

    public Person(String name, String street, String townPostcode, String email, String phone, String web, String company) {
        this.name = name;
        this.street = street;
        this.townPostcode = townPostcode;
        this.email = email;
        this.phone = phone;
        this.web = web;
        this.company = company;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTownPostcode() {
        return townPostcode;
    }

    public void setTownPostcode(String townPostcode) {
        this.townPostcode = townPostcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getAddress() {
        return String.format("%s, %s", street, townPostcode);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
