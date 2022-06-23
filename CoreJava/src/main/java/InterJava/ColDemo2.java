package InterJava;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ColDemo2 {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		ts.add("dddd");
		ts.add("ccc");
		ts.add("eee");
		Iterator<String> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
