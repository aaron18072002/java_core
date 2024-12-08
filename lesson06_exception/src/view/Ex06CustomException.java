package view;

import exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		System.out.println("validate 16 --> " + validate(16));
		
		System.out.println("validate 12 --> " + validate(12));
	}
	
	private static boolean validate(int age) {
		if(age < 16) {
			throw new InvalidAgeException();
		}
		return true;
	}
	
}
