package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

    class addressBook {
    Scanner sc = new Scanner(System.in);
    private ArrayList<ContactPerson> contactBook = new ArrayList<>();

    public ArrayList<ContactPerson> getContactBook() {
        return contactBook;
    }

    public void setContactBook(ArrayList<ContactPerson> contactBook) {
        this.contactBook = contactBook;
    }

    public void addContacts() {
        System.out.println("Enter the Contact details-->");
        System.out.println("Add Contact");
        System.out.println("Enter first name:");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter address");
        String address = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter Phone");
        int phoneNumber = sc.nextInt();
        System.out.println("Enter Zip");
        int zip = sc.nextInt();
        ContactPerson contact = new ContactPerson(firstName, lastName, address, state, city, email, phoneNumber, zip);
        contactBook.add(contact);
        display();
    }

    public void display() {
        for (ContactPerson contacts : contactBook
        ) {
            System.out.println("==Contact Details==");
            System.out.println("\nFirst Name: " + contacts.getFirstName() + "\t Last Name: " + contacts.getLastName()
                    + "\n Address: " + contacts.getAddress() + "  " + contacts.getCity() + "  " + contacts.getState()
                    + "\n Phone Number: " + contacts.getPhoneNumber() + "\tEmail:" + contacts.getEmail());

        }
    }
}