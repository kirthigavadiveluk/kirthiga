class Demo {
	void met(int i, int j, String s) {
	System.out.println(i+":"+j+":"+s);
	
		
	}

	void met2(int a[]) {
		for (int i : a) {
			System.out.println(i);
		}
		
	}

	public class ClassDemo {
		

		public void main(String[] args) {
			
			
			Demo obj = new Demo();
			obj.met(20, 30, "hello");
			obj.met2(new int[] { 10, 20, 30, 40, 50 });
		}

	}
}
