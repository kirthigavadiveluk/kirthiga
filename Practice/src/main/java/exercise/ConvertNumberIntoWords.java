package exercise;

import java.util.Scanner;

public class ConvertNumberIntoWords {
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 9 digits)");
		try {
			number = scanner.nextInt();
			if (number == 0) {
				System.out.println("Number in Words: Zero");
			} else {
				System.out.println("Number in Words:" + numberToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number..");

		}
		scanner.close();
	}

	private static String numberToWord(int number) {
		String words = " ";
		String unitsArray[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
				"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };

		String tensArray[] = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
				"Ninety" };
		if (number == 0) {
			return "Zero";
		}
		if (number < 0) {
			String numberStr = " " + number;
			numberStr = numberStr.substring(1);
			return "minus" + numberToWord(Integer.parseInt(numberStr));
		}
		if ((number / 1000000) > 0) {
			words += " " + numberToWord(number / 1000000) + " Million ";
			number %= 1000000;

		}
		if ((number / 1000) > 0) {
			words += numberToWord(number / 1000) + " Thousand ";
			number %= 1000;
		}
		if ((number / 100) > 0) {
			words += numberToWord(number / 100) + " Hundred ";
			number %= 100;
		}
		if (number > 0) {
			if (number < 20) {
				words += unitsArray[number];

			} else {
				words += tensArray[number / 10];
				if ((number % 10) > 0) {

					words += " " + unitsArray[number % 10];
				}
			}
		}
		return words;
	}
}
