package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact;
    Scanner scanner = new Scanner(System.in);
    private String state;

    public void add(){
        contact = new Contact();
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        System.out.println("enter last name");
        String lastName = scanner.nextLine();
        System.out.println("enter address");
        String address = scanner.nextLine();
        System.out.println("enter city");
        String city = scanner.nextLine();
        System.out.println("enter state");
        String bihar = scanner.nextLine();
        System.out.println("enter zipnum");
        String zip = scanner.nextLine();
        System.out.println("enter phone Number");
        String phone = scanner.nextLine();
        System.out.println("enter email");
        String email = scanner.nextLine();
        System.out.println("contact");
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZipNum(zip);
        contact.setPhoneNum(phone);
        contact.setEmail(email);

    }
}
