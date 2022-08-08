package anoud;

import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = s1.nextDouble();
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * 2 * radius;
		System.out.println("The Circumference Of The Circle is:" + circumference);

	}

}
