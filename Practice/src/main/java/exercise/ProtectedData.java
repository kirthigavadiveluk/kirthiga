package exercise;

class SomeData {
	protected int a = 13;
}

class DataChanges {
	static void change(SomeData sd, int i) {
		sd.a = i;
	}
}

public class ProtectedData {

	public static void main(String[] args) {
		SomeData x = new SomeData();
		System.out.println(x.a);
		DataChanges.change(x, 99);
		System.out.println(x.a);
	}

}
