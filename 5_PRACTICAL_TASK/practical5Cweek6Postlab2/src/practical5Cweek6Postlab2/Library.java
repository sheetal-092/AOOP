package practical5Cweek6Postlab2;

import java.util.ArrayList;
import java.util.List;

public class Library  implements Borrowable{
	 private List<Book> books;
	    private List<String> borrowedBooks;

	    public Library() {
	        books = new ArrayList<>();
	        borrowedBooks = new ArrayList<>();
	    }

	    public void addBook(Book book) {
	        books.add(book);
	    }

	    public void showBooks() {
	        for (Book book : books) {
	            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
	        }
	    }

	    @Override
	    public void borrowBook(Member member) {
	        // Simple logic to simulate borrowing
	        if (!borrowedBooks.contains(member.getMemberId())) {
	            borrowedBooks.add(member.getMemberId());
	            System.out.println(member.getName() + " has borrowed a book.");
	        } else {
	            System.out.println(member.getName() + " has already borrowed a book.");
	        }
	    }

	    @Override
	    public void returnBook(Member member) {
	        if (borrowedBooks.contains(member.getMemberId())) {
	            borrowedBooks.remove(member.getMemberId());
	            System.out.println(member.getName() + " has returned a book.");
	        } else {
	            System.out.println(member.getName() + " has no borrowed books.");
	        }
	    }

}
