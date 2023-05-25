package com.bridgelabz;

import java.io.FileWriter;
import java.nio.file.Path;
import java.util.List;

public class IOImpFile implements WritingService{

    final static String filePath = "D:\\Bridgelabz\\AddressBookIOWorkshop\\src\\main\\java\\com\\bridgelabz\\contacts.txt";

    @Override
    public void writeToIO(List<AddressBook> addressBookList) {
        StringBuffer sb = new StringBuffer();

        addressBookList.stream().forEach(addressBook -> {
            String contact = addressBook.toString().concat("\n");
            sb.append(contact);
        });
        FileWriter
    }



}
