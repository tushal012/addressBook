package com.bridgelabz;

public class AddressBook {
    Contact contact;

    public void add(){
        contact = new Contact();
        contact.setFirstName("axa");
        contact.setLastName("bob");
        contact.setAddress("patna");
        contact.setCity("patnaCity");
        contact.setZipNum("80000");
        contact.setPhoneNum("01264589");
        contact.setEmail("tushalk@gmail.com");
        System.out.println("contact");
    }
}
