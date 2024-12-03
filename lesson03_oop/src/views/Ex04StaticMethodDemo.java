package views;

public class Ex04StaticMethodDemo {
	private final int n;
	
	public Ex04StaticMethodDemo(int n) {
		this.n = n;
	}
	
	public static void main(String[] args) {
		int x1 = 12;
		int x2 = 8;

		System.out.println("Sum from o1 --> " + Ex04StaticMethodDemo.sum(x1, x2));
		
		Ex04StaticMethodDemo o1 = new Ex04StaticMethodDemo(5);		
		System.out.println("n! = " + o1.factorial());
		
		Ex04StaticMethodDemo o2 = new Ex04StaticMethodDemo(6);		
		System.out.println("n! = " + o2.factorial());
		
		Ex04StaticMethodDemo o3 = new Ex04StaticMethodDemo(7);		
		System.out.println("n! = " + o3.factorial());
	}
	
	// Hàm chỉ phụ thuộc vào
	// tham số truyền vào a,b, ko phụ thuộc vào đối tượng đang gọi
	// --> nên là static method
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Hàm nên để non-static
	// getter, setter, toString
	// Viết hàm tính n! yêu cầu non-static
	public long factorial() {
		long sum = this.n;
		int number = this.n;
		while(number > 1) {
			number -= 1;
			sum *= number;
		}
		return sum;
	}
}
