package Day2_QUEUE;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	
    public static void main(String args[])
    {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("1");
        pq.add("2");
        pq.add("3");
        System.out.println("Initial Queue " + pq);

       // pq.remove("1");
       
        System.out.println("Poll Remove " + pq.poll());
        System.out.println("After Poll " + pq);

        System.out.println("Peek Method " + pq.peek());
        System.out.println("Final Queue " + pq);
    }
	

}
