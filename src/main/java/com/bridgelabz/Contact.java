package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String ZipNum;
    private String phoneNum;
    private String email;
    private Object zipnum;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", ZipNum='" + ZipNum + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", zipnum=" + zipnum +
                '}';
    }

    public void setCity(String city) {
        this.city = city;
    }



    public void setState(String state) {
        this.state = state;
    }

    public void setZipNum(String zipNum) {
        this.zipnum = zipnum;
    }

    public void setPhoneNum(String phone) {
        this.phoneNum = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
