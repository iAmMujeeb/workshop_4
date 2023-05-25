package com.bridgelabz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

//    Follow TDD Approach to add the AddressBook objects
//    in which contacts are present into any collection and then Write the objects into a
//    1> Text file
//2> JSON file
//3> CSV file
//Also do abstraction for these three purposes.

    @Test
    public void shouldGiveCountOfContactsAddedIntoTextFile(){
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Mujeeb","Saifi","Mumbai","Maharashtra",400089);
        List<AddressBook> addressBookList = new ArrayList<>();
        addressBookList.add(addressBook);
        AddressBookService addressBookService = new AddressBookService(addressBookList);
        addressBookService.writeToIO(addressBookList);

    }





}
