package anoud;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter An Integer Number:");
		Scanner s1 = new Scanner(System.in);
		num = s1.nextInt();
		if (num % 2 == 0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
	}

}
