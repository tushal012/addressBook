package com.bridgelabz;

public class Contact {
    public String firstName;
    private String lastName;
    private String address;
    public String city;
    public String state;
    private int zip;
    private long mobileNumber;
    private String emailId;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public Contact(String filePath, String filePath1, String filePath2, String filePath3, String filePath4, String filePath5, String filePath6, String filePath7, String filePath8) {
    }

    public Contact(String[] field, String[] field1, String[] field2, String[] field3, String[] field4, String[] field5, String[] field6, String[] field7, String[] field8) {
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
    public String toString(){
        return this.firstName + " " + this.lastName + ":" + this.mobileNumber + ", " + this.emailId +  " "
                + " address:" + this.address + ", state:" + this.state + ", city:" + this.city + ", zipCode:"
                + this.zip;
    }


    public void add(Contact contact1) {
    }
}
