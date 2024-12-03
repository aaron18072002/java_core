package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest01 {
	public static void main(String[] args) {
		// Ngoài package
		// --> public
		InTest01.a2 = 2;
		// InTest01.a3 = 4;		
		// new InTest01().a4 = 4;
	}
}
