
public class InheritanceDemo1 {

	public static void main(String[] args) {
		SuperClass sc=new SubClass();
		System.out.println(sc.name);
		sc.met();
		sc.absmet();
	}

}
abstract class SuperClass{
	public SuperClass() {
		System.out.println("Super class cons called...");
	}
	

	
	final String name="anoud";
	final public void met() {
		System.out.println("met of super class called..");
	}
	abstract  void absmet();
}
class SubClass extends SuperClass{
	public void absmet() {
		System.out.println("met of the class called...");
	}
}