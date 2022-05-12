package anoud;

public class SwapNumDemo {

	public static void main(String[] args) {
		int First=20,Second=30;
		System.out.println("Before Swap-->");
		System.out.println("Swap of First"+First);
		System.out.println("Swap of Second"+Second);
		int temp=First;
		First=Second;
		Second=temp;
		System.out.println("After Swap-->");
		System.out.println("Swap of First"+First);
		System.out.println("Swap of Second"+Second);

	}

}
