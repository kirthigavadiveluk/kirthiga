package InterJava;

public enum Months {
	MONADY("m"),FEBRAURY("f"),MARCH("m"),APRIL("a"),MAY("m");
	private String value;
	private Months(String value) {
		this.value=value;
	}
}
class MonthDemo{
	public static void main(String[] args) {
		for(Months m:Months.values())
		System.out.println(Months.values());
	}
}