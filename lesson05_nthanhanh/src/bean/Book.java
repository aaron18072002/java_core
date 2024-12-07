package bean;

public class Book {
	private String bookId;
	private double price;
	private String publisher;
	
	public Book() {
		
	}

	public Book(String bookId, double price, String publisher) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookId() {
		return bookId;
	}
	
}
