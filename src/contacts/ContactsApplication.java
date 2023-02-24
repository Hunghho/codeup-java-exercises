package contacts;

import com.sun.security.jgss.GSSUtil;
import util.Input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactsApplication {
    private static final String contactsFile = "src/contacts/contacts.txt";

    static List<Contact> contacts = new ArrayList<>();

    // read file
    public static List<String> readFileAndOutput (String filepath){
        Path path = Paths.get(filepath);
        try {
            return Files.readAllLines(path);
        } catch (IOException iox){
            iox.printStackTrace();
            return new ArrayList<>();
        }
    }

    // create directory
    public static void createDir(){
        Path dataDir = Paths.get("src/contacts");
        try{
            if(Files.notExists(dataDir)){
                Files.createDirectories(dataDir);
            } else {
                System.out.println("that directory already exits");
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }
    }

    // create file from directory
    public static void createFile(){
        Path dataFile = Paths.get("src/contacts/contacts.txt");
        try{
            if(Files.notExists(dataFile)){
                Files.createFile(dataFile);
            } else {
                System.out.println("that file already exits");
            }
        } catch (IOException iox){
            iox.printStackTrace();
        }
    }

    // format how contact to be added to contact.txt
    public static String contactLine(Contact contact){
        return String.format("%s|%s", contact.getName(), contact.getNumber());
    }

    // write or append contacts to contact.txt
    public static void addContacts(){
        // add name and number to contacts array
        String name = Input.getString("Enter name (first/last)");
        String number = Input.getString("Enter number (xxx-xxx-xxxx)");
        Contact newContact = new Contact(name, number);
        contacts.add(newContact);
        // create a new list array
        List<String> newContacts = new ArrayList<>();
        for (Contact contact : contacts){
            newContacts.add(contactLine(contact));
        }
        // write or append to contact.txt
        Path dataFile = Paths.get("src/contacts/contacts.txt");
        StandardOpenOption option = StandardOpenOption.APPEND;
        try {
            Files.write(dataFile, newContacts, option);
        } catch (IOException iox){
            iox.printStackTrace();
        }

    }

    public static Contact contactsLine(String line){
        String[] parts = line.split("\\|");
        return new Contact(parts[0], parts[1]);
    }
    // list all contacts
    public static List<Contact> all(){
        List<String> newArray = readFileAndOutput(contactsFile);
        List<Contact> contacts = new ArrayList<>();
        for (String contact : newArray) {
            contacts.add(contactsLine(contact));
        }
        return contacts;
    }

    // search contact
    public static List<Contact> search(String search){
        List<Contact> searchResult = new ArrayList<>();
        for (Contact contact : all()){
            boolean match = contact.getName().toLowerCase().contains(search.toLowerCase());
            if(match) {
                searchResult.add(contact);
            }
        }
        return searchResult;
    }

    // print search contact
    public static void searchContacts(){
        String search = Input.getString("Search contact?");
        List<Contact> results = search(search);
        showContacts(results);
    }

//     deleting contact
    public static void remove(Contact contact){
        List<String> currentList = new ArrayList<>();
        Path dataFile = Paths.get("src/contacts/contacts.txt");
        try{
        currentList = Files.readAllLines(dataFile);
        } catch (IOException iox){
        iox.printStackTrace();
        }
        Iterator<String> listIterator = currentList.iterator();
        currentList.removeIf(item -> item.equals(contact));
        try{
        Files.write(dataFile, currentList);
        } catch (IOException iox){
        iox.printStackTrace();
    }

}

    public static void removeContact(){
        String userEnter = Input.getString("Contact name to remove?");
        List<Contact> results = search(userEnter);
        for(Contact contact : results){
            remove(contact);
        }
    }

    // contact menu

    public static void showContacts(List<Contact> contacts) {
        String contactsFormat = "| %-10s | %10s |\n";
        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found.");
            return;
        }
        System.out.printf(contactsFormat, "Name", "Phone number");
        System.out.println("-----------------------------");
        for (Contact contact : contacts) {
            System.out.printf(contactsFormat, contact.getName(), contact.getNumber());
        }
    }

    public static void main(String[] args) {
//        searchContacts();
//    showContacts(all());
//    all();
//       readFileAndOutput(contactsFile);

//        addContacts();
        System.out.println("""
                1. View contacts.
                2. Add a new contact.
                3. Search a contact by name.
                4. Delete an existing contact.
                5. Exit.""");
        int userEnter = Input.getInt();
        if(userEnter == 1){
            showContacts(all());
        } else if (userEnter == 2) {
            addContacts();
            System.out.println("Contact added");
        } else if (userEnter == 3) {
            searchContacts();
        } else if (userEnter == 4) {
            removeContact();
        } else {
            System.out.println("Good bye!");
        }
    }

}
