package item;

public class Book {
	private String name;
	
	public String getNmae() {
		int id = 0;
		setName("Java");
		return id + this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Book getBook() {
		return this;
	}
}
