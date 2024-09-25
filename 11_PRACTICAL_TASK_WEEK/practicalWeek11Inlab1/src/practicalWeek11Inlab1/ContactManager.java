package practicalWeek11Inlab1;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {
	 private Map<String, String> contacts;

	    public ContactManager() {
	        contacts = new HashMap<>();
	    }

	    public void addContact(String name, String phoneNumber) {
	        contacts.put(name, phoneNumber);
	    }

	    public void removeContact(String name) {
	        contacts.remove(name);
	    }

	    public String getPhoneNumber(String name) {
	        return contacts.get(name);
	    }

	    public void listContacts() {
	        for (Map.Entry<String, String> entry : contacts.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        ContactManager contactManager = new ContactManager();
	        
	        contactManager.addContact("Alice", "123-456-7890");
	        contactManager.addContact("Bob", "234-567-8901");
	        contactManager.addContact("Charlie", "345-678-9012");

	        System.out.println("Phone number of Alice: " + contactManager.getPhoneNumber("Alice"));

	        contactManager.removeContact("Bob");
	        System.out.println("Contacts after removing Bob:");
	        contactManager.listContacts();
	    }
}
