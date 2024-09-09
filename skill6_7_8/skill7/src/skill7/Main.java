package skill7;

public class Main {
	public static void main(String[] args) {
        ContactManager manager = new ContactManager();

       
        manager.addContact(new Contact("Alice", "1234567890", "alice@example.com"));
        manager.addContact(new Contact("Bob", "0987654321", "bob@example.com"));
        manager.addContact(new Contact("Charlie", "1122334455", "charlie@example.com"));
        manager.addContact(new Contact("Alice", "1112223333", "alice_new@example.com"));  // Duplicate

      
        manager.displayContacts();

     
        Contact foundContact = manager.findContactByName("Alice");
        if (foundContact != null) {
            System.out.println("\nFound contact: " + foundContact);
        } else {
            System.out.println("\nContact not found.");
        }

        
        manager.removeContact("Bob");

       
        manager.displayContacts();
    }
}
