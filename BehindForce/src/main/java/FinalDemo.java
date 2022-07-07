
public class FinalDemo {

	public static void main(String[] args) {
		VarTop1 vt=new VarTop1();
		vt.top=20;//variable value cannot change
	}

}
class VarTop1{
	int top=30;
}
class VarMed2 extends VarTop1{
	  int top=20;
	public static void met() {
		
	}
}
class VarBot3 extends VarMed2{
	 int top=10;
	public static void met() {//method cannot be overridden
		System.out.println();
		
	}
}
final class Findemo{
	
}
class findemo extends Findemo{//class cannot  be inherit
	
}