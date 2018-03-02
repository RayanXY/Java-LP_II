import java.util.ArrayList;

public class Bookcase{
	
	private String code;
	private ArrayList<Book> collection;
	
	public Bookcase(String code){
	
		this.code = code;
		collection = new ArrayList<Book>();
	
	}
	
	public String getCode(){
		return code;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	
	public void addBook(Book book){
		collection.add(book);
	}
	
	public void removeBook(Book book){
		collection.remove(book);
	}
	
	public void printCollection(){
		for(Book b : collection){
			System.out.println("Title: " + b.getTitle());
			System.out.println("Gender: " + b.getGender());
			System.out.println("Author: " + b.getAuthor());
			System.out.println("ISBN: " + b.getISBN());
			System.out.println("Year: " + b.getYear());
			System.out.println();
		}
	}
	
}
