package anoud;

import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double length=s1.nextDouble();
		System.out.println("Enter The Width Of The Rectangle");
		double width=s1.nextDouble();
		double area=length*width;
		System.out.println("Area Of Rectangle is"+area);

	}

}
