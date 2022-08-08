//
//public class InterDemo2 {
//
//	public static void main(String[] args) {
//		//part1
//		// Anonymous
//		new FInterOne() {
//
//			@Override
//			public void met() {
//				System.out.println("Anonymus method Called...");
//
//			}
//		}.met();
////		// Method Referencing..
////
////		FInterOne OneMethod = InterDemo2::MyMethod;
////		OneMethod.met();
////
////		// Lambda
////		FInterOne OneLambda = ()->{System.out.println("lambda interface called");};
////		OneLambda.met();
////	}
//	//part 2
//	//Anonymous
//	
//	int value=new FInterTwo() {
//		public int met() {
//			return 100;
//		};
//	//}.met();
//	
//	
//	
//	public static void MyMethod() {
//		System.out.println("method Referencing called...");
//	}
//}
//
//interface FInterOne {
//	public void met();
//}
//
//interface FInterTwo {
//	public int met();
//}
//
//interface FInterThree {
//	public String met(int i, String s);
//}
//
//interface FInterFour {
//	public myAccount Transfer(myAccount act, int amt);
//}
//class myAccount{
//	public void met() {
//		int balance;
//	}
//}
