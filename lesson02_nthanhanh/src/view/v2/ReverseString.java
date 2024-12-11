package view.v2;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println("abcdef --> " + reversedStr("abcdef"));
	}
	
	private static String reversedStr(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i =  str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
}
