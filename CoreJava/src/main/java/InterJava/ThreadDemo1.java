package InterJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println("Soup...");
		ExecutorService es = Executors.newFixedThreadPool(1);
		es.execute(() -> {
			met();
		});
		es.shutdown();
		System.out.println("Starter");
	}

	public static void met() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}
		System.out.println("Main Item..");
		
	}
}
