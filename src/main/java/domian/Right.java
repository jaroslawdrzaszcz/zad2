package domian;

public enum Right {
	regular("regular"), premium("premium"), administrator("administrator");
	
	private String name;

	public String getValue() {
		return name;
	}

	private Right (String right) {
		name = right;
	}
}
