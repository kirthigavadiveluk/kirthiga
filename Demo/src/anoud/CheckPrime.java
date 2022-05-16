package anoud;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=s1.nextInt();
		s1.close();
		for(int i=2;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+"is a prime number");
		else
			System.out.println(num+"is not a prime Number");

	}

}
