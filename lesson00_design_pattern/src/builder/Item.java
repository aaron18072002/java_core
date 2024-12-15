package builder;

import java.time.LocalDate;

/**
 * Sử dụng builder pattern để tạo đối tượng cho Item
 * --> cách1(truyền thống)
 * 
 * B1: Từ Item, nhờ Builder	tạo ra 1 đối tượng chứa full thông tin như Item
 * 		--> có đầy đủ tt giống Item
 * B2: Item muốn set bao nhiêu tt thì dùng Builder set trước rồi copy sau
 * B3: Gọi hàm build trong class Builder để build ra đối tượng Item
 * 
 * Bản thân class Item ko được phép tự tạo đối tượng
 * --> private constructor
 * Muốn Item immutable
 * --> chỉ tạo hàm getter, ko tạo hàm setter
 * 
 * class nằm bên trong class --> nested class
 * 
 * Builder là static class vì
 * + nếu non-static, muốn truy cập được Builder thì phải tạo 1 đối tượng Item
 * 	(ko hợp lí, vì nếu tạo được đối tượng Item thì ko cần Builder)
 * + tạo đối tượng Builder thông qua Item.builder() 
 */
public class Item {
	
	private int id;
	private String name;
	private Double salesPrice;
	private Double buyPrice;
	private Double tax;
	private int amount;
	private LocalDate startedDate;
	private LocalDate expiredDate;
	
	private Item() {
		
	}
	
	private Item(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.salesPrice = builder.salesPrice;
		this.buyPrice = builder.buyPrice;
		this.tax = builder.tax;
		this.amount = builder.amount;
		this.startedDate = builder.startedDate;
		this.expiredDate = builder.expiredDate;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	// chỉ có getters, ko có setters
	// 	ko có setters(muốn immutable,ko thể set các giá trị các tt trong	 
	//	ô nhớ HEAP)
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalesPrice() {
		return salesPrice;
	}
	
	public Double getBuyPrice() {
		return buyPrice;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public LocalDate getStartedDate() {
		return startedDate;
	}
	
	public LocalDate getExpiredDate() {
		return expiredDate;
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice + ", tax="
				+ tax + ", amount=" + amount + ", startedDate=" + startedDate + ", expiredDate=" + expiredDate + "]";
	}

	// ================ Nested class ==================
	public static class Builder	{
		
		private int id;
		private String name;
		private Double salesPrice;
		private Double buyPrice;
		private Double tax;
		private int amount;
		private LocalDate startedDate;
		private LocalDate expiredDate;
		
		// chỉ có setters, ko có getter
		// để mà gán trị sau khi tạo đối tượng builder		

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withSalesPrice(Double salesPrice) {
			this.salesPrice = salesPrice;
			return this;
		}

		public Builder withBuyPrice(Double buyPrice) {
			this.buyPrice = buyPrice;
			return this;
		}

		public Builder withTax(Double tax) {
			this.tax = tax;
			return this;
		}

		public Builder withAmount(int amount) {
			this.amount = amount;
			return this;
		}

		public Builder withStartedDate(LocalDate startedDate) {
			this.startedDate = startedDate;
			return this;
		}

		public Builder withExpiredDate(LocalDate expiredDate) {
			this.expiredDate = expiredDate;
			return this;
		}

		public Item build() {
			return new Item(this);
		}
		
	}
	
}
