package bean;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Item {
	
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private LocalDate expiredDate;
	
	public Item() {
		
	}

	public Item(Integer id, String name, BigDecimal salesPrice, LocalDate expiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.expiredDate = expiredDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	public static String toLine(Item item) {
		return item.getId() + ", " + item.getName() + ", "
				+ item.getSalesPrice() + ", " + item.getExpiredDate();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		return this.getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ "]";
	}
	
}
