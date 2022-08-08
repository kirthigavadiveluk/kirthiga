package anoud;

public class Programming1 {
	// ternary operator

	// ?
	public static void main(String[] args) {
		String result = (7 % 2 == 0) ? "Even Number ..." : "Odd Number...";
		System.out.println(result);
		System.out.println((30 < 20) ? "yes it will lesser than 20" : "no it is not lesser than twenty");

		if (4 % 2 == 0) {
			System.out.println("Even number...");
		} else {
			System.out.println("Odd number....");
		}
		String name = "kirthiga";
		if (name.equals("ram")) {
			System.out.println("my name is ram....");
		} else if (name.equals("jaanu")) {
			System.out.println("my name is jaanu....");
		} else if (name.equals("kirthiga")) {
			System.out.println("my name is kirthiga....");
		} else {
			System.out.println("im not....");
		}

	}

}
