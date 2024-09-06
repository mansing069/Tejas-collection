package Day_1_Collection_ArrayList_LinkedList;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList

public class ArrayList1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numberList =new ArrayList<>(); // change only ArrayList to Linked List.
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(null);   //add null value
		numberList.add(10);
		numberList.add(20);
		numberList.add(40);
		numberList.add(null);	//duplicate value is added
		
		System.out.println(numberList);  //Print the list
		System.out.println("Size:"+numberList.size()); //print the number of List
		System.out.println("IS Empty the List:"+numberList.isEmpty()); // list is Empty or not
		System.out.println("Element at index 5: "+numberList.get(5) );      // Element access via IndexNumber
		numberList.add(7,50);   //add new value inbetween two index(between 40& null)  
		System.out.println("After adding 50 at index 7"); //print the added value 50
		System.out.println(numberList); //Print the value
		numberList.remove(2); // remove the value in Index-2
		System.out.println("After Deleting element at Index 3 "+numberList); //print after remove index-2
		numberList.remove(Integer.valueOf(10));
		System.out.println("After deleting element 10 " +numberList);
	
	}
	}
