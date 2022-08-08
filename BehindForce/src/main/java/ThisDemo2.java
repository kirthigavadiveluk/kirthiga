
public class ThisDemo2 {
		String s;
		public ThisDemo2(String s) {
			this.s=s;
		}
		public static void main(String[] args) {
			ThisDemo2 obj=new ThisDemo2("Some Value...");
			obj.printS("aaaa");
			
	}
		public void printS(String s) {
			System.out.println(this.s);
		}

}
