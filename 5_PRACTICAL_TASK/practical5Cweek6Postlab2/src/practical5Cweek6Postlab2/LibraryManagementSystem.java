package practical5Cweek6Postlab2;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", "123456");
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "654321");
        
        library.addBook(book1);
        library.addBook(book2);
        
        System.out.println("Available books:");
        library.showBooks();
        
        Member member1 = new Member("Alice", "M001");
        library.borrowBook(member1);
        library.returnBook(member1);
    }
}
