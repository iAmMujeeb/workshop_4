package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    List<AddressBook> addressBookList;
    WritingService writingService;

    public AddressBookService(List<AddressBook> addressBookList) {
        this.addressBookList = addressBookList;
    }


    public void writeToIO(List<AddressBook> addressBookList) {
        writingService.writeToIO(addressBookList);
    }
}
