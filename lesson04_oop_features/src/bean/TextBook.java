package bean;

public class TextBook extends Book {
	private Boolean isNew;
	private Double discountInPercent;
	
	public TextBook() {
		
	}
	
	// this: đại diện cho đối tượng hiện tại đang gọi hàm, thuộc tính
	//	   : gọi hàm khởi tạo của chính nó
	
	// super: đại diện cho đối tượng cha của
	//        đối tượng hiện tại đang gọi hàm, thuộc tính

	public TextBook(String id, String name, Double price, Boolean isNew, Double discountInPercent) {
		super(id, name, price);
		this.isNew = isNew;
		this.discountInPercent = discountInPercent;
	}
	
	public TextBook(String id, String name, Double price) {
//		super(id, name, price);
//		this.isNew = true;
//		this.discountInPercent = 0d;
		this(id,name,price,true,0d);
	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Double getDiscountInPercent() {
		return discountInPercent;
	}

	public void setDiscountInPercent(Double discountInPercent) {
		this.discountInPercent = discountInPercent;
	}

	@Override
	public String toString() {
		return "TextBook [id=" + super.getId() + ", name=" + super.getId() + ", price=" 
				+ super.getPrice() + ", isNew=" + this.isNew
				+ ", discountInPercent=" + this.discountInPercent + "]";
	}
	
}
