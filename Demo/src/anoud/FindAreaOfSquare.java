package anoud;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
	System.out.println("Enter Side Of Square:");
	Scanner s1 =new Scanner(System.in);
	double side =s1.nextDouble();
	double area=side*side;
	System.out.println("Area of Square is:"+area);
	

	}

}
