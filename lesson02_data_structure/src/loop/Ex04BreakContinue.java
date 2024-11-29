package loop;

public class Ex04BreakContinue {
	public static void main(String[] args) {
		// break: thoát khỏi vòng lặp
		// continue: kết thúc vòng lặp hiện tại
		
		for(int i = 1; i <= 10; i++) {
			if(i%5 == 0) {
				break;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("\n====================\n");
		
		for(int i = 1; i <= 10; i++) {
			if(i%5 == 0) {
				// kết thúc sớm vòng lặp hiện tại
				// nhảy sang vòng lặp tiếp theo
				// bỏ qua đoạn code phía dưới
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
