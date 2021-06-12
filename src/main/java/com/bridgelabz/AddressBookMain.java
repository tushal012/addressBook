package com.bridgelabz;


public class AddressBookMain {
    private final Object addressBook;

    public AddressBookMain(Object addressBook) {
        this.addressBook = addressBook;
    }
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Desktop\\CsvReader\\AddressBookIO";
        System.out.println("Starting File writing :" + filePath);
        AddressBook.writeCsv(filePath);
        System.out.println("starting read file");
        AddressBook.readCsv(filePath);
    }


}




