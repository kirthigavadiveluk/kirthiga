package InterJava;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ColDemo7 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("101", "Riya");
		tm.put("102", "AAAA");
		System.out.println(tm);
		
		System.out.println(tm.get("102"));
		
		Set st = tm.entrySet();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			Map.Entry me =(Map.Entry) it.next();
			System.out.println(me.getKey() + "...." + me.getValue());

		}

	}

}
