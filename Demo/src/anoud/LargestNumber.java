package anoud;

public class LargestNumber {

	public static void main(String[] args) {
		int n1 = 200, n2 = 100, n3 = 4000;
		if (n1 >= n2 && n1 >= n3)
			System.out.println("N1 is Largest");
		else if (n2 >= n1 && n2 >= n3)
			System.out.println("N2 is Largest");
		else
			System.out.println("N3 is Largest");

	}

}
