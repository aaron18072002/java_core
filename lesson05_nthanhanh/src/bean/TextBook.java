package bean;

public class TextBook extends Book {
	private boolean isNew;
	
	public TextBook() {
		
	}
	
	public TextBook(String bookId, double price, String publisher) {
		this(bookId,price,publisher,true);
	}
	
	public TextBook(String bookId, double price, String publisher, boolean isNew) {
		super(bookId,price,publisher);
		this.isNew = isNew;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TextBook [isNew=" + isNew + ", getPrice()=" + getPrice() + ", getPublisher()=" + getPublisher()
				+ ", getBookId()=" + getBookId() + "]";
	}
	
}
