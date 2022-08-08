package exercise;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int temp;

		boolean isPrime = true;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = s1.nextInt();
		s1.close();
		for (int i = 2; i <= n / 2; i++) {
			temp = n % i;
			if (temp == 0) {
				isPrime = false;
				break;

			}
		}
			if (isPrime)
				System.out.println(n + "is a prime number");

			else
				System.out.println(n + "is not a prime number");

		

	}

}
