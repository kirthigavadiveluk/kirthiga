
public class ExcepDemo4 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			String s = args[0];
			Integer.parseInt(s);

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} finally {
			System.out.println("Finally Block Code Called");
		}
		System.out.println("After Exception");
	}

}
 