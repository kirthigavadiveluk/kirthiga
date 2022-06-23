package InterJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ColDemo8 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("101", "eeee");
		hm.put("102", "ggg");
		System.out.println(hm);
		System.out.println(hm.get("101"));

		Set<Map.Entry<String, String>> st = hm.entrySet();
		Iterator<Map.Entry<String, String>> it = st.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me.getKey() + "..." + me.getValue());
		}
	}

}
