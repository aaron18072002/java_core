package bean;

public class Store {
	private String name;
	private int openingHour;
	private int closingHour;
	
	public Store(String name, int openHour, int closeHour) {
		this.name = name;
		this.openingHour = openHour;
		this.closingHour = closeHour;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", openHour=" + 
				openingHour + ", closeHour=" + closingHour + "]";
	}
}
