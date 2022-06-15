package InterJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo7 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Gun bofors = new Gun();
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				bofors.load();
			}
		});
		es.execute(() -> {
			for (int i = 0; i < 5; i++) {
				bofors.shoot();
			}
		});
		es.shutdown();

	}

}

class Gun {
	boolean flag;

	synchronized public void load() {
		if(flag) {
			try {
				wait();
			}catch(Exception e) {
			}
		}
			System.out.println("Loader Loads The Gun..");
			flag=true;
			notify();
			}

	synchronized public void shoot() {
		if(!flag) {
			try {
				wait();
			}catch(Exception e) {}
		}
			System.out.println("Shooter Shoots ...The Gun..");
			flag=false;
			notify();
			

	}
	}
