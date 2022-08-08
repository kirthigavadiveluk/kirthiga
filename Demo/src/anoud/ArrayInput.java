package anoud;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int[] array = new int[3];
		int sum = 0;
		System.out.println("Enter the Elements:");
		
		for (int i = 0; i < 3; i++) {
			array[i] = s1.nextInt();

		}
		for (int num : array) {
			sum = sum + num;
		}
		System.out.println("Sum Of Array Element Is" + sum);
	}
}
