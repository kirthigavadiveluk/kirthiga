package exercise;

public class CalculateSecondYearAndThirdYear {

	public static void main(String[] args) {
		float total = 14000;
		System.out.println("Original Investment:$" + total);

		total = total - 1500f;
		System.out.println("After Two Year:$" + total);
		total = total + (total * .12f);
		System.out.println("After Three Year:$" + total);

	}

}
