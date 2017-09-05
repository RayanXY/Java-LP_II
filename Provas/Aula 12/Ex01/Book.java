public class Book{

	private String title;
	private String gender;
	private String author;
	private String ISBN;
	private int year;
	
	public Book(String title, String gender, String author, String ISBN, int year){
	
		this.title = title;
		this.gender = gender;
		this.author = author;
		this.ISBN = ISBN;
		this.year = year;
	
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getGender(){
		return gender;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setGender(String gender){
		this.gender = gender;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public void setYear(int year){
		this.year = year;
	}

}
