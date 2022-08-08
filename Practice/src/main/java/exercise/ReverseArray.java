package exercise;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	  static void reverse(Integer a[])
	    {
	        Collections.reverse(Arrays.asList(a));
	        System.out.println(Arrays.asList(a));
	    }
	  
	    public static void main(String[] args)
	    {
	        Integer [] arr = {10, 20, 100, 40, 50};
	        reverse(arr);
	    }
	

	}


