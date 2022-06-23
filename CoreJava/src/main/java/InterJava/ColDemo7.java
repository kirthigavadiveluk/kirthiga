package InterJava;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo7 {

	public static void main(String[] args) {
		Map<String, String> tm = new TreeMap<String, String>();
		tm.put("101", "Riya");
		tm.put("102", "AAAA");
		System.out.println(tm);
		
		System.out.println(tm.get("102"));
		
		Set<Map.Entry<String, String>> st = tm.entrySet();
		Iterator<Map.Entry<String, String>> it = st.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me.getKey() + "...." + me.getValue());

		}

	}

}
