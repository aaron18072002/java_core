package datastructure.object;

public class Item {
	// thuộc tính
	public int id;
	public String name;
	public double salesPrice;
	
	public Item() {
		
	}
	
	@Override
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salesPrice;
	}
}
