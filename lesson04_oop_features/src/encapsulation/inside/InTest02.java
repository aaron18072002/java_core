package encapsulation.inside;

public class InTest02 {
	public static void main(String[] args) {
		// Chung package
		// --> protected, , public
		InTest01.a2 = 2;
		InTest01.a3 = 4;		
		new InTest01().a4 = 4;
	}
}
