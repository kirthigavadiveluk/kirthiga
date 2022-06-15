package InterJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		CounsellingHall anna=new CounsellingHall();
		ExecutorService es=Executors.newFixedThreadPool(3);
		es.execute(()->{Thread.currentThread().setName("Kamal");anna.showPapers();
		anna.selectCollege();
		anna.exit();
		});
		es.execute(()->{Thread.currentThread().setName("Rajini");
		anna.showPapers();
		anna.selectCollege();
		anna.payFees();
		anna.exit();
		});
	
		
		es.execute(()->{Thread.currentThread().setName("Captain");
		anna.showPapers();
		anna.selectCollege();
		anna.payFees();
		anna.exit();
		});
		es.shutdown();
		
	}

}
class CounsellingHall{
	synchronized public void showPapers() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"Showing Paper");
		try {Thread.sleep(3000);}catch(Exception e){}
		System.out.println(name+"Completed Showing Paper..");
	}
	synchronized public void selectCollege() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"Selecting College");
		try {Thread.sleep(4000);}catch(Exception e) {}
		System.out.println(name+"Completed Selecting College..");
	
	}
	synchronized public void payFees() {
		Thread t= Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"Paying Fees");
		try {Thread.sleep(3000);}catch(Exception e) {}
		System.out.println(name+"Payed Fees");
		
	}
	synchronized public void exit() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+"Exit..");
	}
}
