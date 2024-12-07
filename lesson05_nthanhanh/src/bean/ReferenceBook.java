package bean;

public class ReferenceBook extends Book {
	private double taxInPercent;
	
	public ReferenceBook() {
		
	}
	
	public ReferenceBook(String bookId, double price, String publisher) {
		this(bookId,price,publisher,0.0d);
	}
	
	public ReferenceBook(String bookId, double price, String publisher, double taxInPercent) {
		super(bookId,price,publisher);
		if(taxInPercent <= 1 && taxInPercent >= 0) {	
			this.taxInPercent = taxInPercent;
		}
	}

	public double getTaxInPercent() {
		return taxInPercent;
	}

	public void setTaxInPercent(double taxInPercent) {
		this.taxInPercent = taxInPercent;
	}

	@Override
	public String toString() {
		return "ReferenceBook [taxInPercent=" + taxInPercent + ", getPrice()=" + getPrice() + ", getPublisher()="
				+ getPublisher() + ", getBookId()=" + getBookId() + "]";
	}
	
}
