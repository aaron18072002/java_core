package builder;

import java.time.LocalDate;

public class PvItem {
	
	private int id;
	private String name;
	private Double salesPrice;
	private LocalDate expiredDate;
	
	private PvItem() {
		
	}
	
	public static PvItem clone(PvItem source) {
		PvItem target = new PvItem();
		target.id = source.id;
		target.name = source.name;
		target.salesPrice = source.salesPrice;
		target.expiredDate = source.expiredDate;
		return target;
	}
	
	// shortcut method to create new PvItem
	public static PvItem of() {
		return new PvItem();
	}

	public int getId() {
		return id;
	}
	
	// trả về ô nhớ mới
	public PvItem withId(int id) {
		if(id == this.id) {
			return this;
		}
		PvItem newObject = PvItem.clone(this);
		newObject.id = id;
		return newObject;
	}

	public String getName() {
		return name;
	}

	public PvItem withName(String name) {
		if(name == this.name) {
			return this;
		}
		PvItem newObject = PvItem.clone(this);
		newObject.name = name;
		return newObject;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public PvItem withSalesPrice(Double salesPrice) {
		if(salesPrice == this.salesPrice) {
			return this;
		}
		PvItem newObject = PvItem.clone(this);
		newObject.salesPrice = salesPrice;
		return newObject;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public PvItem withExpiredDate(LocalDate expiredDate) {
		if(expiredDate == this.expiredDate) {
			return this;
		}
		PvItem newObject = PvItem.clone(this);
		newObject.expiredDate = expiredDate;
		return newObject;
	}

	@Override
	public String toString() {
		return "PvItem [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ "]";
	}
	
}
