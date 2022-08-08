package exercise;

import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {

	public static void main(String[] args) {
		Integer[] arr = { 3, 8, 5, 2 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Descending Order:" + Arrays.toString(arr));

	}

}
