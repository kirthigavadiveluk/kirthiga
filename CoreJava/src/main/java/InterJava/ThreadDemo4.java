package InterJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo4 {

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(2);
		Theatre1 iMax=new Theatre1();
		Theatre1 iMax2=new Theatre1();
		
		es.execute(
				()->{
					synchronized(Theatre1.class) {
					//synchronized(iMax) {
					Thread.currentThread().setName("rajini");
					//Theatre.toilet.useToilet();
					iMax.toilet.useToilet();
					}
				}
		);
		
		es.execute(
				()->{
					synchronized(Theatre1.class) {
					//synchronized(iMax2) {
					Thread.currentThread().setName("kamal");
					//Theatre.toilet.useToilet();
					iMax2.toilet.useToilet();
					}
				}
		);
		es.shutdown();
	}
}
class Toilet1{
	public void useToilet() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name+" is using the toilet...");
		try {Thread.sleep(5000);}catch(Exception e) {}
		System.out.println(name+" came out of toilet...");
	}
}
class Theatre1{
	 Toilet1 toilet=new Toilet1();
}