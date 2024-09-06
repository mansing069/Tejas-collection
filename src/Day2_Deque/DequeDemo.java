package Day2_Deque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

//day 28-2/2024--DeQueue Demo(Leacture)
public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> myDeque = new ArrayDeque<>();
		
		
		for(int i=10;i<101;) {
			myDeque.add(i);
			i+=10;
		}
		System.out.println(myDeque);
		
		myDeque.addFirst(5);   // add First
		myDeque.addLast(110);   // add Last
		myDeque.offerFirst(4);	// add First
		myDeque.offerLast(111);	// add Last
		
		myDeque.push(3); 		// add First
		System.out.println(myDeque);
		
		System.out.println(myDeque.peek()); //first element
		System.out.println(myDeque);
		
		System.out.println(myDeque.peekLast());//Last element
		System.out.println(myDeque);
		
		System.out.println(myDeque.pollFirst());// remove first element
		System.out.println(myDeque);
		
		System.out.println(myDeque.pollLast());// remove Last element
		System.out.println(myDeque);
		
		System.out.println(myDeque.removeLastOccurrence(1000));// remove unavailable element in list(result false)
		System.out.println(myDeque);
		
		List<Integer>arrayList= new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		myDeque.removeAll(arrayList);	//remove arraylist value in myDeque 
		System.out.println(myDeque);

		
	}

}
