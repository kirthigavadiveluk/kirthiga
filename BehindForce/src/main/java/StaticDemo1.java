
public class StaticDemo1 {

	public static void main(String[] args) {
		House.saram = "this is common saram...";
		System.out.println(House.saram);

		House veedu1 = new House();
		House.saram = "2 ton saram bought...";
		veedu1.toilet = "western toilet...";

		System.out.println("Veedu1 saram...:" + House.saram);
		System.out.println("Veedu1 toilet..:" + veedu1.toilet);
		veedu1.toilet("plastic..taps...");

		House veedu2 = new House();
		
		System.out.println("Veedu2 saram...:" + House.saram);
		System.out.println("Veedu2 toilet..:" + veedu2.toilet);
		veedu2.toilet("steel tap....");

		System.out.println("v1..:" + veedu1.toilet);
		System.out.println("v2..:" + veedu2.toilet);

		House.saram = "3 ton saram....";

		System.out.println("v2...:" + House.saram);
	}
}

class House {
	static String saram;
	static String toilet;

	public void toilet(String tap) {
		String taps = tap;
		System.out.println(taps);
	}
}