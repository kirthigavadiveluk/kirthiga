package anoudpack;

public class classDemo {
public static void main(String[] args) {
	Laddu laddu=new Laddu();
	System.out.println("Before Passing"+laddu.size);//10
	new exp().PBR(laddu);
	System.out.println("After Passing"+laddu.size);//10
}
}
class exp{
	public void PBR(Laddu laddu) {
		laddu.size=5;
	}
	public void PBV(int size) {
		 size = 5;
	}
}
class Laddu{
	int size=10;
}