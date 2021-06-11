package com.bridgelabz;

import java.util.*;


public class AddressBook {
    public static List<Contact> employeeContactList;
    public AddressBook(List<Contact> employeeContactList) {
        this.employeeContactList = employeeContactList;
    }

    /* @Description - to write the employee contacts details */
    static void writeEmployeeContactData(Scanner consoleInputReader) {
        System.out.println("Enter your first name");
        String firstName = consoleInputReader.nextLine();
        System.out.println("Enter your last name");
        String lastName = consoleInputReader.nextLine();
        System.out.println("Enter your address name");
        String address = consoleInputReader.nextLine();
        System.out.println("Enter your city name");
        String city = consoleInputReader.nextLine();
        System.out.println("Enter your state name");
        String state = consoleInputReader.nextLine();
        System.out.println("Enter your zip  code ");
        int  zip = consoleInputReader.nextInt();
        System.out.println("Enter your zip  code ");
        long  mobileNumber = consoleInputReader.nextLong();
        System.out.println("Enter your email Id");
        String emailId = consoleInputReader.nextLine();

    }

    /* @Description - to read  the employee contacts details */
    static void readEmployeeContactData() {
        System.out.println("Write employee contacts details " + employeeContactList);
    }
}


