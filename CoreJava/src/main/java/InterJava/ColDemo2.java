package InterJava;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo2 {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		ts.add("ttt");
		ts.add("ccc");
		ts.add("eee");
		ts.add("tdrg");
		System.out.println(ts);
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
