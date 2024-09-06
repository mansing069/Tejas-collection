package Day_1_Collection_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;

// Day-25-2-2024   ListInterface 

// Used Method-->isEmpty,add,null,size,at Index 5,remove

public class ListInterface {
	public static void main(String[]agrs) {
		
		List<Integer>numberList =new ArrayList<>();
		System.out.println("Is Empty: " + numberList.isEmpty());	 // Check the Any Empty in List
		numberList.add(10);
		numberList.add(20);		  // Add values
		numberList.add(30);
		numberList.add(null);    // add null value
		numberList.add(10);		 // In array add Multipal null value
		numberList.add(20);
		numberList.add(40);	
		numberList.add(null);	// add Multipal null value
		
		
		System.out.println(numberList);
		System.out.println("numberList size: " + numberList.size());  // Count the total no in list. 
		System.out.println("Is Empty: " + numberList.isEmpty());		 // Check the Any Empty in List
		System.out.println("Element at Index 5: " + numberList.get(5));	// Find the element via Index 5
		numberList.add(7,50);											// add 50 at Index 7
		System.out.println("After Adding 50 at index 7");
		System.out.println(numberList);
		numberList.remove(7);											// remove 50 at Index 7
		System.out.println("After Deleting 50 at index 7");
		System.out.println(numberList);
		numberList.remove(Integer.valueOf(10));							//Deleting value 10.(delete 1st apperance)
		System.out.println("After Deleting 10 value");
		System.out.println(numberList);
		
	}

}
