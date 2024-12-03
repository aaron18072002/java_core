package beans;

public class Car {
	
	// attribute
	private Integer id;
	private String model;
	private String name;
	private Double salesPrice;
	
	// constructor default
	public Car() {
		
	}
	
	// getter, setter
	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	// constructor full parameters
	public Car(Integer id, String model, String name, Double salesPrice) {
		this.id = id;
		this.model = model;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", name=" + name + ", "
				+ "salesPrice=" + salesPrice + "]";
	}
}
