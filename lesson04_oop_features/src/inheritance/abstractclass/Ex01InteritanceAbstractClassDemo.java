package inheritance.abstractclass;

public class Ex01InteritanceAbstractClassDemo {
	
	public static void main(String[] args) {
		EmailService em1 = new StandardEmailService();
		
		// anonymous class
		EmailService em2 = new EmailService() {		
			@Override
			void login() {
				System.out.println("Anonymous em2 # login");
			}
		};
		em2.login();
		em2.login2Steps();
	}
	
}
