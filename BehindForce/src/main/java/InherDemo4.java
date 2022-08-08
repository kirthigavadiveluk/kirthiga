
public class InherDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass1 sc=new SubClass2();
		System.out.println(sc.s);
		sc.Display();
		sc.met();
	}

}
abstract class SuperClass1{
	String s="Hello";
	public void met() {
		System.out.println("print");
		
	}
	abstract void Display();
}
class SubClass2 extends SuperClass1{
	 public void Display() {
		System.out.println("World");
	}
}
