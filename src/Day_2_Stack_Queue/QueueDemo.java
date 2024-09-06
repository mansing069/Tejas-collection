package Day_2_Stack_Queue;

import java.util.PriorityQueue;

//day 28-2/2024--QueueDemo

public class QueueDemo {
	public static void main(String[]args) {
		PriorityQueue<Integer>priorityQueue =new PriorityQueue<>();
		
		for(int i=10;i<=101;) {
			priorityQueue.add(i);
			i+=10;
		}
		System.out.println(priorityQueue);
		
		int element =priorityQueue.peek(); //peek -return First element
		System.out.println("Returning element is:" +element);

		System.out.println(priorityQueue);	
		
		
		element =priorityQueue.poll();	//poll -Remove First element(10)
		System.out.println("Remove element is:" +element);

		System.out.println(priorityQueue);	
		
	}

}
