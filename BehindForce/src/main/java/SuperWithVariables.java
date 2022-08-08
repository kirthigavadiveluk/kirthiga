
public class SuperWithVariables {

	public static void main(String[] args) {
		VarBot vb=new VarBot();
		System.out.println(vb.Top);
		vb.met();
		
	}

}
class VarTop{
	int Top=30;
}
class VarMed extends VarTop{
	int Top=20;
}
class VarBot extends VarMed{
	int Top=10;
	public void met() {
		System.out.println("Local"+Top);
		System.out.println("Parent"+super.Top);
	}
}
