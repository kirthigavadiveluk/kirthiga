package anoud;

public class Programming3 {

	public static void main(String[] args) {
		// in while loop the condition is check first
//		while(true) { //infinite loop
//			System.out.println("called....");
//		}

		// in case of do while loop, the condition is check after one execution..
//		do {
//			System.out.println("called....");
//		}while(true);

		int n = 10;

//		while(n>10) {
//			System.out.println("loop executed - while...");
//		}
//		
//		do {
//			System.out.println("loop executed - do while...");
//		}while(n>10);

		while (n > 0) {
			System.out.println(n);
			n--;
		}

	}
}
