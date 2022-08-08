package anoud;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.println("n please enter any integer value below 10:");
		number = s1.nextInt();
		while (number <= 10) {
			sum = sum + number;
			number++;

		}
		System.out.println("sum of the number from the while loop is:%d" + sum);

	}

}
