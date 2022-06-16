package InterJava;

public enum Fruits {
	mango, apple, grapes;

	String details;

	private Fruits() {
	}// constructor

	private Fruits(String details) {
		this.details = details;
	}// parameterized constructor

}
