package ArrayDequeDemo_Day1;

//ArrayDequeDemo


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//ArrayDequeDemo
public class ArrayDequeDemo {
 public static void main(String[] args) {
     // Creating and initializing deque
     // Declaring object of integer type
     Deque<Integer> myDeque = new ArrayDeque<Integer>(10);

     // Operations 1
     // add() method

     // Adding custom elements
     // using add() method to insert
     myDeque.add(10);
     myDeque.add(20);
     myDeque.add(30);
     myDeque.add(40);
     myDeque.add(50);

     // Iterating using for each loop
     for (Integer element : myDeque) {
         // Print the corresponding element
         System.out.println("Element : " + element);
     }

     // Operation 2
     // clear() method
     System.out.println("Using clear() ");

     // Clearing all elements using clear() method
     myDeque.clear();

     // Operations 3
     // addFirst() method

     // Inserting at the start
     myDeque.addFirst(564);
     myDeque.addFirst(291);

     // Operation 4
     // addLast() method
     // Inserting at end
     myDeque.addLast(24);
     myDeque.addLast(14);

     // Display message
     System.out.println("Above elements are removed now");

     // Iterators

     // Display message
     System.out.println("Elements of deque using Iterator :");

     for (Iterator itr = myDeque.iterator(); itr.hasNext(); ) {
         System.out.println(itr.next());
     }

     // descendingIterator()
     // To reverse the deque order
     System.out.println("Elements of deque in reverse order :");

     for (Iterator dItr = myDeque.descendingIterator(); dItr.hasNext(); ) {
         System.out.println(dItr.next());
     }

     // Operation 5
     // element() method : to get Head element
     System.out.println("\nHead Element using element(): " + myDeque.element());

     // Operation 6
     // getFirst() method : to get Head element
     System.out.println("Head Element using getFirst(): " + myDeque.getFirst());

     // Operation 7
     // getLast() method : to get last element
     System.out.println("Last Element using getLast(): " + myDeque.getLast());

     // Operation 8
     // toArray() method :
     Object[] arr = myDeque.toArray();
     System.out.println("\nArray Size : " + arr.length);

     System.out.print("Array elements : ");

     for (int i = 0; i < arr.length; i++)
         System.out.print(" " + arr[i]);

     // Operation 9
     // peek() method : to get head
     System.out.println("\nHead element : " + myDeque.peek());

     // Operation 10
     // poll() method : to get head
     System.out.println("Head element poll : " + myDeque.poll());

     // Operation 11
     // push() method
     myDeque.push(265);
     myDeque.push(984);
     myDeque.push(2365);
     System.out.println("After pushing 265, 984 and 2365 deque is: "+myDeque);
     // Operation 12
     // remove() method : to get head
     System.out.println("Head element remove : " + myDeque.remove());

     System.out.println("The final array is: " + myDeque);
 }
}

