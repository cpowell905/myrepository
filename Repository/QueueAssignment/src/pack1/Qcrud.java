package pack1;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.List;

public class Qcrud {
	
	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(123);
		q.add(3);
		q.add(8);
		q.add(666);
		System.out.println("The Queue: " + q);
		q.add(314159);
		System.out.println("Queue Updated: " + q);
		q.remove(1);
		System.out.println("Queue after deletion: " + q);
	
	}
}
