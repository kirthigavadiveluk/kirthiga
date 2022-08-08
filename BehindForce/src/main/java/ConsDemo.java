
public class ConsDemo {

	public  ConsDemo() {
		System.out.println("Cons With Default Called...");
	}
	public  ConsDemo(int i) {
		System.out.println("Cons With i Value Called..."+i);
	}
	public ConsDemo(Employee e) {
		System.out.println("Employee Cons Called.."+e);
	}
	public static void main(String[] args) {
		new ConsDemo();
		new ConsDemo(20);
		new ConsDemo(new Employee());
		
	}
}
	class Employee{
		
	}

