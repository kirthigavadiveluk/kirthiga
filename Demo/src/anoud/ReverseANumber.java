package anoud;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Input Your Number And Press Enter:");
		Scanner s1=new Scanner(System.in);
		num=s1.nextInt();
		while(num !=0) {
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
			
		}
		System.out.println("Reverse Of Input Number Is:"+reversenum);

	}

}
