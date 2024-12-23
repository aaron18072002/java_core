package bean;

import java.util.Objects;

public class Item {

	private Integer id;
	private String name;
	
	public Item() {
		
	}

	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
}
