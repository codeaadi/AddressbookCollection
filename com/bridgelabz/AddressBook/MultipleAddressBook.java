package com.bridgelabz.AddressBook;
import java.util.*;
public class MultipleAddressBook {


    public class AddressBook {
        String addressBookName;
        static Scanner sc = new Scanner(System.in);

        AddressBook(String addressBookName) {
            this.addressBookName = addressBookName;
        }

        static Map<String, Contact> addressBook = new HashMap<>();

        /*
         * method to add contact to addressBook
         */
        public static void addContact() {

            System.out.println("enter the first name");
            String firstName = sc.nextLine();
            System.out.println("enter the last name");
            String lastName = sc.nextLine();
            System.out.println("enter the address");
            String address = sc.nextLine();
            System.out.println("enter the city");
            String city = sc.nextLine();

            System.out.println("enter the state");
            String state = sc.nextLine();
            System.out.println("enter the zip code");
            String zip = sc.nextLine();
            System.out.println("enter the phone Number");
            String phone = sc.nextLine();
            System.out.println("enter the email Id ");
            String email = sc.nextLine();
            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
            Contact c = addressBook.get(firstName);
            if (c != null) {
                System.out.println("There is already a person with this name ");
            } else {
                addressBook.put(firstName, contact);
            }

        }

        /*
         * method to edit contact in addressBook
         */
        public static void editPerson() {

            System.out.println("enter the first name");
            String firstName = sc.nextLine();
            System.out.println("enter the last name");
            String lastName = sc.nextLine();


            Contact contact = addressBook.get(firstName);
            if (contact == null) {
                System.out.println("Person of that name not exits in this book");
            } else {
                int choice;

                Scanner r = new Scanner(System.in);
                while (true) {
                    System.out.println("What do you wanna edit");
                    System.out.println(
                            "1 First Name\n2 Last Name\n3 Address\n4 City\n5 State\n6Zip\n7 Phone number\n8Email\n9Go back");
                    choice = r.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("enter the first name");
                            String eFirstName = sc.nextLine();
                            // person.firstName = firstName;
                            contact.firstName = eFirstName;
                            break;
                        case 2:
                            System.out.println("enter the last name");
                            String eLastName = sc.nextLine();
                            contact.lastName = eLastName;
                            break;
                        case 3:
                            System.out.println("enter the address");
                            String address = sc.nextLine();
                            contact.address = address;
                            break;
                        case 4:
                            System.out.println("enter the city");
                            String city = sc.nextLine();
                            contact.city = city;
                            break;
                        case 5:
                            System.out.println("enter state");
                            String state = sc.nextLine();
                            contact.state = state;
                            break;
                        case 6:
                            System.out.println("enter the zip code");
                            String zip = sc.nextLine();
                            contact.zip = zip;
                            break;
                        case 7:
                            System.out.println("enter phone number");
                            String phone = sc.nextLine();
                            contact.phoneNumber = phone;
                            break;
                        case 8:
                            System.out.println("enter email");
                            String email = sc.nextLine();
                            contact.eMail = email;
                            break;
                        case 9:
                            return;
                    }
                }

            }

        }

        /*
         * method to delete person from addressBook
         */
        public static void deletePerson() {

            System.out.println("enter the first name");
            String firstName = sc.nextLine();

            Contact c = addressBook.get(firstName);
            if (c == null) {
                System.out.println("Person of that name not exits in this book");

            } else {
                addressBook.remove(firstName);
            }

        }

        /*
         * method to print addressBook
         */
        public void print() {

            for (Contact contacts : addressBook.values()) {
                System.out.println("Full Name: " + contacts.firstName + "  " + contacts.lastName
                        + "\n Address: " + contacts.address + "  City: " + contacts.city + " State: " + contacts.state + " Pincode: " + contacts.zip
                        + "\n Email: " + contacts.eMail + " PhoneNumber: " + contacts.phoneNumber);
            }

        }

    }
}
