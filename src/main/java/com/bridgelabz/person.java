package com.bridgelabz;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNum;

    void setPerson(String fname, String lname, String address, String city, String state, int zip, String phoneNum){
        this.firstName=fname;
        this.lastName=lname;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNum=phoneNum;
    }

    void setFName(String fname){this.firstName=fname;}
    void setLName(String lname){this.lastName=lname;}
    void setAddress(String address){this.address=address;}
    void setCity(String city){this.city=city;}
    void setState(String state){this.state=state;}
    void setZip(int zip){this.zip=zip;}
    void setPhoneNum(String phoneNum){this.phoneNum=phoneNum;}

    String getFName(){return firstName;}
    String getLName(){return lastName;}
    String getAddress(){return address;}
    String getCity(){return city;}
    String getState(){return state;}
    int getZip(){return zip;}
    String getPhoneNum(){return phoneNum;}

    @Override
    public String toString() {
        return "Person [firstName=" + firstName +
                ", lastName=" + lastName +
                ", address=" + address +
                ", city=" + city +
                ", state=" + state +
                ", zip=" + zip +
                ", phoneNum=" + phoneNum + "]";
    }
}
