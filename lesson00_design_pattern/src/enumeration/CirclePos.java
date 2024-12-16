package enumeration;

public enum CirclePos {
	// public static final CirclePos INSIDE = new CirclePos("Trên đường tròn");
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String localizeMessage;
	
	// Chỉ được phép có private constructor
	private CirclePos(String localizeMessage) {
		this.localizeMessage = localizeMessage;
	}
	
}
