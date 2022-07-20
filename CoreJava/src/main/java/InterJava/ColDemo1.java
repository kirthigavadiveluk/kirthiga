package InterJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ColDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("eee");
		list.add("eee");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}