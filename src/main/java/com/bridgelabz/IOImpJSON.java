package com.bridgelabz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class IOImpJSON implements WritingService {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    static String json;

    final static String filePath = "D:\\Bridgelabz\\AddressBookIOWorkshop\\src\\main\\java\\com\\bridgelabz\\contacts.json";

    @Override
    public void writeToIO(List<AddressBook> addressBookList) throws IOException{
        json = gson.toJson(addressBookList);
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(json);
        fileWriter.close();
    }

    @Override
    public void readFromIO() throws IOException {
        try (Reader reader = new FileReader(filePath)) {
            JsonArray array = gson.fromJson(reader, JsonArray.class);
//            System.out.println(array);
            System.out.println(json);
        }
    }

    @Override
    public long countEntries() throws IOException {
        long count = 0;
        List<AddressBook> addressBookList = new ArrayList<>();
        try (Reader reader = new FileReader(filePath)) {
            JsonArray array = gson.fromJson(reader, JsonArray.class);
            for (JsonElement element : array) {
                AddressBook addressBook = gson.fromJson(element, AddressBook.class);
                addressBookList.add(addressBook);
                count++;
            }
        }
//        System.out.println(addressBookList.get(0).personList);
        return count;
    }

}
