package anoud;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter The Width Of Triangle:");
		double base = s1.nextDouble();
		System.out.println("Enter The Height Of Triangle");
		double height = s1.nextDouble();
		double area = (base * height) / 2;
		System.out.println("Area of Triangle is-->" + area);

	}

}
