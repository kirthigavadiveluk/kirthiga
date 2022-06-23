package InterJava;

import java.util.Map;
import java.util.WeakHashMap;

public class ColDemo10 {

	public static void main(String[] args) {
		Map<String, String> map = new WeakHashMap<String, String>();
		String key1 = new String("101");
		String key2 = new String("102");

		map.put(key1, "Behind Force");
		map.put(key2, "Anoud Tech");
		System.out.println(map);
		key1 = null;
		System.out.println(map);
		System.gc();
		System.out.println(map);

	}

}
