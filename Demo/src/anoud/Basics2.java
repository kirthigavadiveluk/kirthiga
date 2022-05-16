package anoud;

import java.util.Scanner;

public class Basics2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i = s1.nextInt();
		System.out.println("Enter the value of j");
		int j = s1.nextInt();
		int mul = i * j;
		System.out.println("The multiplication of i and j is .." + mul);

	}

}
