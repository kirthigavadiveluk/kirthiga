package InterJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColDemo4 {
		public static void main(String[] args) {
			Queue<String> pq=new PriorityQueue<String>();
			pq.add("Goo");
			pq.add("Doo");
			pq.add("Forr");
			pq.add("ioo");
			System.out.println(pq);
		}
}
