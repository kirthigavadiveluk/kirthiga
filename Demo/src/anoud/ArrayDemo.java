package anoud;

public class ArrayDemo {

	public static void main(String[] args) {
		
			int []a= {10,20,30,40};
			
			System.out.println(a[0]);
			System.out.println(a[2]);
			
			System.out.println("The length of array.COLUMNS.."+a.length);
			
			int[][] twod= {
					{20,40,60},
					{30,50,70},
					{1,3,5},
					{20,50,34}
			};
			
			System.out.println(twod[0][0]);
			
			System.out.println("No of rows..:"+twod.length);
			System.out.println("No of columns..:"+twod[0].length);
			
			int columns=5;
			int[] arr=new int[columns];
			System.out.println(arr.length);
			
			System.out.println(arr[1]);
			
			int rows=3;
			
			int[][] twodarr=new int[rows][columns];
			System.out.println(twodarr.length);
	}

}
