package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNum;

    public Contacts(String firstName, String lastName, String address, String city, String state, int zip, long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    @Override
    public boolean equals(Object obj) {
        boolean result = false;


        if(obj == this) {
            return true;
        }
        Contact contact = (Contact)obj;

        if(contact.firstName.equals(this.firstName) && contact.lastName.equals(this.lastName)) {
            result = true;
        }
        return result;
    }
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + ":" + this.mobileNumber + ", " + this.emailId +  " "
                + " address:" + this.address + ", state:" + this.state + ", city:" + this.city + ", zipCode:"
                + this.zip;
    }



}
