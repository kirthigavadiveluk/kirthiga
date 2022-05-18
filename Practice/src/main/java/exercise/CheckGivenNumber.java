package exercise;

import java.util.Scanner;

public class CheckGivenNumber {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Number Maximum A Digit");
		int num = s1.nextInt();
		System.out.println("Enter Your Choice:");
		int a = s1.nextInt();
		switch (a) {
		case 1:
			int n = num;
			int res = 0, remainder;
			while (num > 0) {
				remainder = num % 10;
				res = res + (remainder * remainder * remainder);
				num = num / 10;

			}

			if (res == n)
				System.out.println(n + "is an ArmStrong Number");
			else
				System.out.println(n + "is not an ArmStrong Number");
			break;
		case 2:
			int k = num;
			int reverse = 0, rem;
			while (num > 0) {
				rem = num % 10;
				reverse = reverse * 10 + rem;
				num = num / 10;

			}
			if (reverse == k)
				System.out.println(k + "Palindrome NUmber");
			else
				System.out.println(k + "is not a Palidrome Number");
			break;

		case 3:
			int perfectNo = 0;
			int i;
			System.out.println("Factor are:");
			for (i = 1; i < num; i++) {
				if (num % i == 0) {
					perfectNo += i;
					System.out.println(i);

				}
			}

			if (perfectNo == num) {
				System.out.println("is a Perfect Number");
			} else {
				System.out.println("is not a Perfect Number");
			}
		default:
			System.out.println("none of these");
		}

	}

}
