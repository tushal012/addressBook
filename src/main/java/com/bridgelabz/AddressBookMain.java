package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

import static com.bridgelabz.AddressBook.employeeContactList;

public class AddressBookMain {
    private final Object addressBook;

    public AddressBookMain(Object addressBook) {
        this.addressBook = addressBook;
    }

    public static void main(String[] args) {
        ArrayList<Contact> employeePayrollList = new ArrayList<>();
        AddressBook addressBook = new AddressBook(employeeContactList);
        Scanner consoleInputReader = new Scanner(System.in);
        AddressBook.writeEmployeeContactData(consoleInputReader);
        AddressBook.readEmployeeContactData();

    }
}




