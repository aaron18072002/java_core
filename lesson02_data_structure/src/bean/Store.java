package bean;

public class Store {
	private String name;
	private int openHour;
	private int closeHour;
	
	public Store(String name, int openHour, int closeHour) {
		this.name = name;
		this.openHour = openHour;
		this.closeHour = closeHour;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", openHour=" + 
				openHour + ", closeHour=" + closeHour + "]";
	}
}
