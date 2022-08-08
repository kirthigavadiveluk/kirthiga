package exercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayResize {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 20, 30, 40, 50 };
		for (int a : arr) {
			System.out.println(a);
		}
		
		List<Integer> List=new ArrayList<Integer>();
		for(int a:arr) {
			List.add(a);
		}
			System.out.println(List);
		List.add(100);
		System.out.println(List);
		
	}

}
