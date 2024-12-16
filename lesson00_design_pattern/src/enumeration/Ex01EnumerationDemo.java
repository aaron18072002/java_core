package enumeration;

import static java.lang.Math.*;

public class Ex01EnumerationDemo {
	
	// Record: biến những tt thành final, ko hỗ trợ setter
		private static record Point(int x, int y) {	
		}
		
		private static record Circle(Point p, double r) {
		}

	// Xác định vị trí của 1 điểm A(xA,yA) với đường tròn tâm O bán kính r
	
	public static void main(String[] args) {
		Point pA = new Point(3,4);
		Circle circle = new Circle(new Point(0,0), 5.0d);
		System.out.println("Vị trí: " + getPosition(pA, circle));
	}
	
	public static String getPosition(Point pA, Circle circle) {
		Point pO = circle.p();
		double r = circle.r();
		double d = sqrt(pow(pA.y - pO.y,2) + pow(pA.x - pO.x,2));
		if(d > r) {
			return "Ngoài đường tròn";
		}
		if(d == r) {
			return "Trên đường tròn";
		}
		return "Trong đường tròn";
	}
	
}
