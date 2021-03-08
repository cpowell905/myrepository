package pack1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class QvsLL {
		public static void main(String[] args) {

			List li = new LinkedList();
			li.add("hello");
			li.add(123);
			li.add(3.14159);
			li.add('Q');
			li.add(true);
			li.add(null);
			li.add("I like pie");
			li.add("The cow jumped over the moon");

			System.out.println(li);
			
			PriorityQueue pq = new PriorityQueue();
			pq.add("hello");
			pq.add(123);
			pq.add(3.14159);
			pq.add("Q");
			pq.add(true);
			pq.add(null);
			pq.add("I like pie");
			pq.add("The cow jumped over the moon");
			System.out.println(pq);
			
			
			
	
		}
}
