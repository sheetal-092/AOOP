package skill7;

import java.util.*;

public class ContactManager {
	 private Set<Contact> contacts;               
	    private Map<String, Contact> contactMap;     

	    public ContactManager() {
	        contacts = new HashSet<>();              
	        contactMap = new HashMap<>();         
	    }

	    
	    public void addContact(Contact contact) {
	        if (contacts.add(contact)) {            
	            contactMap.put(contact.getName(), contact);  
	            System.out.println("Added: " + contact);
	        } else {
	            System.out.println("Contact already exists: " + contact.getName());
	        }
	    }

	   
	    public void removeContact(String name) {
	        Contact contact = contactMap.remove(name);
	        if (contact != null) {
	            contacts.remove(contact);
	            System.out.println("Removed: " + name);
	        } else {
	            System.out.println("No contact found with name: " + name);
	        }
	    }

	  
	    public Contact findContactByName(String name) {
	        return contactMap.get(name);  
	    }

	   
	    public void displayContacts() {
	        System.out.println("\nAll Contacts:");
	        for (Contact contact : contacts) {
	            System.out.println(contact);
	        }
	    }
}
