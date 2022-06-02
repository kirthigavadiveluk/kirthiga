
public class StaticComplexType {

	public static void main(String[] args) {
		ClassRoom newton = new ClassRoom();
		ClassRoom edison = new ClassRoom();

		System.out.println(newton.sanyo + ":" + newton.sulab);
		System.out.println(edison.sanyo + ":" + edison.sulab);
	}

}

class ClassRoom {
	Projector sanyo = new Projector();
	static Toilet sulab = new Toilet();
}

class Projector {

}

class Toilet {

}
