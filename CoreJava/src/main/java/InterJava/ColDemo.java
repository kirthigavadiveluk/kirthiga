package InterJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColDemo{
	public static void main(String[] args) {
		Set<String> hs=new HashSet<String>();
		hs.add("sa");
		hs.add("ri");
		hs.add("ga");
		hs.add("");
		hs.add("ma");
		System.out.println(hs);
		
		hs.remove("ga");
		
		Iterator<String> it=hs.iterator(); 
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println(hs.isEmpty());
			System.out.println(hs.contains("234"));
			System.out.println(hs.size());
		
		
		
	}
}
