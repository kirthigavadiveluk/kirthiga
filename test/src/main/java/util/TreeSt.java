package util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSt{
	

	public static void main(String[] args) {
		Set tr=new TreeSet(new MyComparator());
		tr.add(new A("Aa"));
		tr.add(new A("Ba"));
		tr.add(new A("Ca"));
		System.out.println(tr);
	}
}
class MyComparator implements Comparator<A>{
	@Override
	public int compare(A o1, A o2) {
		return o2.compareTo(o1);
	}
}
class A implements Comparable<A>{
	String name;
	public A(String name) {
		this.name=name;
	}
	@Override
	public int compareTo(A o) {
		return name.compareTo(o.name);
	}
	@Override
	public String toString() {
		
		return this.name;
	}

}