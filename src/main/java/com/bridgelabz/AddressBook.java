package com.bridgelabz;

import java.util.List;

public class AddressBook {

    public void addContact(String firstName, String lastName, String city, String state, int zip) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
    }
}
