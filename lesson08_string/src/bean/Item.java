package bean;

public class Item implements Comparable<Item> {

	private Integer id;
	private String name;
	
	public Item() {
		
	}

	public Item(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	// i1.compareTo(i2)
	// this(i1)
	// o(i2)
	// int: dương i1 > i2
	//		0	  i1 = i2
	//		âm	  i1 < i2
	@Override
	public int compareTo(Item o) {
		Integer id1 = this.getId();
		Integer id2 = o.getId();
		
		// Quy ước null < value
		if(id1 == null && id2 == null) {
			return 0;
		}
		
		if(id1 == null) {
			return -1;
		}
		
		if(id2 == null) {
			return 1;
		}
		
		return this.getId() - o.getId();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
}
