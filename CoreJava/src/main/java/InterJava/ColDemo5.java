package InterJava;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

public class ColDemo5 {

	public static void main(String[] args) {
		List<B> li=new ArrayList<B>();
		li.add(new B("RIYA"));
		System.out.println(li);
			}
	
}
class MyComparable1 implements Comparator<B>{
	@Override
	public int compare(B o1, B o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
	
}
class B implements Comparable<B >{
	String name;
	public B(String name) {
		this.name=name;
	}
	@Override
	public int compareTo(B o) {
		
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		
		return this.name;
	}
}