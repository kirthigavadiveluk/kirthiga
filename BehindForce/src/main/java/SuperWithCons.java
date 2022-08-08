
public class SuperWithCons {

	public static void main(String[] args) {
		ConsBot cb=new ConsBot("aaa");
	}

}
abstract class ConsTop{
	public ConsTop() {
		System.out.println("Top Cons Object Created..");
	}
}
abstract class ConsMed extends ConsTop{
	public ConsMed(int i) {
		System.out.println("Med Cons Object Called.."+i);
	}
}
class ConsBot extends ConsMed{
	public ConsBot(String s) {
		super(100);
		System.out.println("Bottom Cons Object Created..");
	}
}

