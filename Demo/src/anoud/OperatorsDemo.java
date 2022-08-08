package anoud;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic operators
				//+,-,*,%,/
				
				int n1=10;
				int n2=2;
				
				System.out.println(n1+n2);
				
				System.out.println(n1-n2);
			
				System.out.println(n1*n2);
				
				System.out.println(n1/n2);
			
				System.out.println(n1%n2);
				
				
				int i=n1++;
				i=++n1;
				System.out.println(i);
				
				int x=20;
				
				System.out.println(x++);
				System.out.println(x);
				
				x=20;
				System.out.println(x--);
				System.out.println(x);
				
				x=20;
				
				System.out.println(++x);
				System.out.println(x);
				
				x=20;
				System.out.println(--x);//first it will decrement and then print
				System.out.println(x);
				
				x=20;
				//x=x+4;
				x+=4;
				System.out.println(x);
				
				x=20;
				//x=x-5;
				x-=5;
				System.out.println(x);
				
				x=20;
				//x=x*2;
				x*=2;
				System.out.println(x);
				
				x=20;
				//x=x/3;
				x/=3;
				System.out.println(x);
				
				x=20;
				//x=x%3;
				x%=3;
				System.out.println(x);
				
				
				
				int num1=100;
				int num2=200;
				System.out.println(num1==num2);
				System.out.println(num1!=num2);
				System.out.println(num1<num2);
				System.out.println(num1>num2);
				System.out.println(num1<=num2);
				System.out.println(num1>=num2);				
				System.out.println(!(num1>=num2));				
				//Logical operators = &&, ||, !
				
				System.out.println(num1<num2 || num1==101);
				
				System.out.println(num1<num2 && num1==101);
	}

}
