package anoud;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int n, number = 0, i, j;
		// To get the user's input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows for floyd's triangle:");
		// Copying user input into an integer variable named rows
		n = input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("**");
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(number + " ");
				// Incrementing the number value
				number++;
			}
			// For new line
			System.out.println();
		}

	}

}
