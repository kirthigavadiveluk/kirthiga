package InterJava;

public class UseEnum {

	public static void main(String[] args) {
		System.out.println(Fruits.valueOf("apple").details);
		for (Fruits f : Fruits.values()) {
			System.out.println(f.details);
		}
		Fruits f = Fruits.grapes;
		switch (f) {
		case apple: {
			System.out.println("This is appleeeee");
			break;

		}
		case mango: {
			System.out.println("This is mangooooooo");
			break;
		}
		default: {
			System.out.println("all your sin are forgiven....");
		}
		}

	}

}
