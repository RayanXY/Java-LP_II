public class Library{
	
	public static void main(String [] args){
	
		Book book_1 = new Book("Harry Potter and the Philosopher's Stone", "Fantasy", "J. K. Rowling", "0-7475-3269-9", 1997);
		Book book_2 = new Book("Harry Potter and the Chamber of Secrets", "Fantasy", "J. K. Rowling", "0-7475-3849-2", 1998);
		Book book_3 = new Book("Harry Potter and the Prisoner of Azkaban", "Fantasy", "J. K. Rowling", "0-7475-4215-5", 1999);	
		Book book_4 = new Book("Harry Potter and the Goblet of Fire", "Fantasy", "J. K. Rowling", "0-7475-4624-X", 2000);	
		Book book_5 = new Book("Harry Potter and the Order of the Phoenix", "Fantasy", "J. K. Rowling", "0-7475-5100-6", 2003);	
		Book book_6 = new Book("Harry Potter and the Half-Blood Prince", "Fantasy", "J. K. Rowling", "85-325-1947-4", 2005);
		Book book_7 = new Book("Harry Potter and the Deathly Hallows", "Fantasy", "J. K. Rowling", "978-972-23-3835-6", 2007);
		Book book_8 = new Book("The Lord of the Rings - The Fellowship of the Ring", "Fantasy", "J. R. R. Tolkien", "887-555-784-4", 1954);
		Book book_9 = new Book("The Lord of the Rings - The Two Towers", "Fantasy", "J. R. R. Tolkien", "789-1547-885-2", 1954);
		Book book_10 = new Book("The Lord of the Rings - The Return of the King", "Fantasy", "J. R. R. Tolkien", "999-785-996-7", 1955);
		
		Bookcase library = new Bookcase("55588-S");
		
		library.addBook(book_1);
		library.addBook(book_2);
		library.addBook(book_3);
		library.addBook(book_4);
		library.addBook(book_5);
		library.addBook(book_6);
		library.addBook(book_7);
		library.addBook(book_8);
		library.addBook(book_9);
		library.addBook(book_10);
		
		library.printCollection();
		
		library.removeBook(book_3);
		library.removeBook(book_7);
		
		library.printCollection();
		
	}

}
