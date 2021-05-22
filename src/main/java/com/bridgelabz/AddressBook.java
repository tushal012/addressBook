package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    Contact contact;
    Scanner scanner = new Scanner(System.in);
    private String state;

    public Contact getContact() {
        return contact;
    }

    public void add() {
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

    public boolean edit() {
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        if (firstName.equals(contact.getfirstName()) == false) {
            return false;

        }
        System.out.println("which details you want to edit:");
        System.out.println("press 1 for changing first name:");
        System.out.println("press 1 for changing last name:");
        System.out.println("press 1 for changing address:");
        System.out.println("press 1 for changing city:");
        System.out.println("press 1 for changing state:");
        System.out.println("press 1 for changing Zip Num:");
        System.out.println("press 1 for changing phone Num:");
        System.out.println("press 1 for changing email:");
        int choice = Integer.valueOf(scanner.next());
        switch (choice) {
            case 1:
                contact.setFirstName(scanner.nextLine());
                break;
            case 2:
                contact.setLastName(scanner.nextLine());
                break;
            case 3:
                contact.setAddress(scanner.nextLine());
                break;
            case 4:
                contact.setCity(scanner.nextLine());
                break;
            case 5:
                contact.setState(scanner.nextLine());
                break;
            case 6:
                contact.setZipNum(scanner.nextLine());
                break;
            case 7:
                contact.setPhoneNum(scanner.nextLine());
                break;
            case 8:
                contact.setEmail(scanner.nextLine());
                break;
            default:
        }

        return true;
    }

    public boolean delete() {
        System.out.println("enter first name");
        String firstName = scanner.nextLine();
        if (firstName.equals(contact.getfirstName()) == false) {
            return false;
        }

        System.out.println("which details you want to delete:");
        System.out.println("press 1 for changing first name:");
        System.out.println("press 1 for changing last name:");
        System.out.println("press 1 for changing address:");
        System.out.println("press 1 for changing city:");
        System.out.println("press 1 for changing state:");
        System.out.println("press 1 for changing Zip Num:");
        System.out.println("press 1 for changing phone Num:");
        System.out.println("press 1 for changing email:");
        int choice = Integer.valueOf(scanner.next());
        switch (choice) {
            case 1:
                contact.setFirstName(scanner.nextLine());
                break;
            case 2:
                contact.setLastName(scanner.nextLine());
                break;
            case 3:
                contact.setAddress(scanner.nextLine());
                break;
            case 4:
                contact.setCity(scanner.nextLine());
                break;
            case 5:
                contact.setState(scanner.nextLine());
                break;
            case 6:
                contact.setZipNum(scanner.nextLine());
                break;
            case 7:
                contact.setPhoneNum(scanner.nextLine());
                break;
            case 8:
                contact.setEmail(scanner.nextLine());
                break;
            default:

        }
                return true;

    }
}


