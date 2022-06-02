
public class Mutability {

	public static void main(String[] args) {
		int n = 100;
		int k = n;
		n = n + 100;
		System.out.println(n);
		System.out.println(k);
		String str = "hello";
		String temp = str;
		str = str + "World.......";
		System.out.println(str);
		System.out.println(temp);

		World w = new World();
		World tempw = w;
		w.size = 110000;
		System.out.println(w.size);
		System.out.println(tempw.size);
	}
}

class World {
	int size = 10;
}