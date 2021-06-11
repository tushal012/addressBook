package com.bridgelabz;

public class AddressBookMain {
    private final Object addressBook;

    public AddressBookMain(Object addressBook) {
        this.addressBook = addressBook;
    }

    public static void main(String[] args) {
        AddressBook addressbook = new AddressBook();
        addressbook.selectOption();

    }
}




