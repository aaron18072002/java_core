package inheritance.iinterface;

public class Rectangle implements Shape {
	
	@Override
	public void calcS() {
		System.out.println("Rectangle#calcS ...implementation");
	}
	
	@Override
	public void setBorder() {
		System.out.println("1px");
	}
	
}
