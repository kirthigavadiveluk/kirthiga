package InterJava;

import java.lang.reflect.Method;

public class Consumer {

	public static void main(String[] args) throws Exception{
		 Food food=new Food();
		// veg Veg=food.getClass().getAnnotation(veg.class);
		// if(Veg==null) {
		 //System.out.println("non vegetarian food...");
		// }
		// else {
		// System.out.println("This is a vegetarian food..");

		// }
		Method m=food.getClass().getMethod("rice");
		veg Veg=m.getAnnotation(veg.class);
		if(Veg==null) {
			System.out.println("rice is non vegetrian food..");
			
		}else {
			System.out.println("rice is vegetrian food..");
		}
	}

}
