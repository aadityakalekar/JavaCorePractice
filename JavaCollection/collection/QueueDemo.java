package day3.collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(43);
		queue.add(54);
		queue.add(46);
		queue.add(45);
		//FIFO
		System.out.println(queue);
		int value = queue.peek();
		System.out.println(value);
		System.out.println(queue);
		value = queue.poll();
		System.out.println(value);
		System.out.println(queue);
		System.out.println("Deque");
		Deque<Integer> queue2 = new LinkedList<>();
		queue2.add(43);
		queue2.add(54);
		queue2.add(46);
		queue2.add(45);// === addLast()
		queue2.addFirst(54);
		//FIFO + LIFO
		System.out.println(queue2);
		value = queue2.peek();  //peekFirst()
		System.out.println(value);
		value = queue2.peekLast();
		System.out.println(value);
		System.out.println(queue);
		value = queue2.poll(); // === pollFirst()
		System.out.println(value);
		value = queue2.pollLast();
		System.out.println(value);
		System.out.println(queue);

		Queue<Integer> queue1 = new PriorityQueue<>();
		queue1.add(34);
		queue1.add(54);
		queue1.add(75);
		queue1.add(34);
		System.out.println(queue1);
		queue1.add(3);
		System.out.println(queue1);
		
		
	}
}
