package com.bridgelabz;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

//    Follow TDD Approach to add the AddressBook objects
//    in which contacts are present into any collection and then Write the objects into a
//    1> Text file
//    2> JSON file
//    3> CSV file
//    Also do abstraction for these three purposes.

    @Test
    public void givenNoOfContactsWhenWrittenToFileShouldReturnCount() {
        List<AddressBook> addressBookList = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook1);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook2);
        WritingService writingService = new IOImpFile();
        AddressBookService addressBookService = new AddressBookService(addressBookList, writingService);
        addressBookService.writeToIO();
        addressBookService.readFromIO();
        long actualCount = addressBookService.countEntries();
        Assertions.assertEquals(3, actualCount);
    }

    @Test
    public void givenNoOfContactsWhenWrittenToCSVShouldReturnCount() {
        List<AddressBook> addressBookList = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook1);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook2);
        WritingService writingService = new IOImpCSV();
        AddressBookService addressBookService = new AddressBookService(addressBookList, writingService);
        addressBookService.writeToIO();
        addressBookService.readFromIO();
        long actualCount = addressBookService.countEntries();
        Assertions.assertEquals(10, actualCount);
    }

    @Test
    public void givenNoOfContactsWhenWrittenToJSONShouldReturnCount() {
        List<AddressBook> addressBookList = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook1);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook2);
        WritingService writingService = new IOImpJSON();
        AddressBookService addressBookService = new AddressBookService(addressBookList, writingService);
        addressBookService.writeToIO();
        addressBookService.readFromIO();
        long actualCount = addressBookService.countEntries();
        Assertions.assertEquals(3, actualCount);
    }

}
