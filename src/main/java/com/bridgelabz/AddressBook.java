package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class AddressBook {

    public static void writeCsv(String filePath) {
        List<Contact> contact = new ArrayList<Contact>();
        Contact contact1 = new Contact(filePath, filePath, filePath, filePath, filePath, filePath, filePath,
                filePath, filePath);
        contact1.setFirstName("Tushal");
        contact1.setLastName("kumar");
        contact1.setAddress("patna");
        contact1.setCity("patnacity");
        contact1.setState("Bihar");
        contact1.setZip(800123);
        contact1.setMobileNumber(985252774);
        contact1.setEmailId("tushalkashyap11@gmail.com");
        contact1.add(contact1);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append("firstName,lastName,address,city,state,zip,mobileNumber,EmailId");
            for (Contact ad : contact) {
                fileWriter.append(String.valueOf(ad.getFirstName()));
                fileWriter.append(String.valueOf(ad.getLastName()));
                fileWriter.append(String.valueOf(ad.getAddress()));
                fileWriter.append(String.valueOf(ad.getCity()));
                fileWriter.append(String.valueOf(ad.getState()));
                fileWriter.append(String.valueOf(ad.getZip()));
                fileWriter.append(String.valueOf(ad.getMobileNumber()));
                fileWriter.append(String.valueOf(ad.getEmailId()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void readCsv(String filePath) {
        BufferedReader reader = null;
        try {
            List<Contact> empContact = new ArrayList<Contact>();
            String line = "";
            reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();
            while (( reader.readLine() != null)) {
                String[] field = line.split(",");
                if (!(field.length<= 0)) {
                    Contact contact = new Contact(field, field, field, field, field, field, field, field,
                            field);
                    contact.setFirstName("Tushal");
                    contact.setLastName("kumar");
                    contact.setAddress("patna");
                    contact.setCity("patnacity");
                    contact.setState("bihar");
                    contact.setZip(800123);
                    contact.setMobileNumber(985252774);
                    contact.setEmailId("tushalkashyap11@gmail.com");
                    contact.add(contact);
                }
            }
            for (Contact ad : empContact) {
                System.out.printf(
                        "First Name = %s,Last Name = s, Address = %s, City = %s, State = %s,Zip = %s,Phone Number = %s,Email = %s",
                        ad.getFirstName(), ad.getLastName(), ad.getAddress(), ad.getCity(), ad.getState(), ad.getZip(),
                        ad.getMobileNumber(), ad.getEmailId());
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


