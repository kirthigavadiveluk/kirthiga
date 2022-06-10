
public class ThrowThrowsDemo {

	public static void main(String[] args) throws Exception {
		MyHouse house=new MyHouse();
		try {
			house.visit("postman");
	}catch(Exception e) {
		System.out.println(e);
	}
		System.out.println("program continues...");
	}
}
class ThrowDemo{
	public void test(int i)throws Exception {
		if(i==0) {
			throw new Exception();
		}
	}
}
class MyHouse{
	public void visit(String visitor) throws DogBiteException{
		if(visitor.equals("postman")) {
			throw new DogBiteException();
		}
		System.out.println("plays with them...");
	}
}
class DogBiteException extends Exception{
	
}
