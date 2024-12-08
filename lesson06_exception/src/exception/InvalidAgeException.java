package exception;

public class InvalidAgeException extends RuntimeException {
	
	// liên quan đến xử lý file
	// liên quan đến cách lưu trữ dữ liệu xuống file
	private static final long serialVersionUID = 1L;
	
	public InvalidAgeException() {
		this("Age required is not valid");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
}
