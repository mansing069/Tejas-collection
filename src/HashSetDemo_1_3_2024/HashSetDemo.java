package HashSetDemo_1_3_2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//HashSet-->duplicate not allowed-->Unordered Collections-->

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>myHashSet =new HashSet<>(); //using hashset-->Duplicate are not allowed
	//	List<Integer>myHashSet =new ArrayList<>(); // Using List-->Duplicate are allowed
		myHashSet.add(80);
		myHashSet.add(50);
		myHashSet.add(30);
		myHashSet.add(100);
		myHashSet.add(null); 
		myHashSet.add(80);
		myHashSet.add(50);
		myHashSet.add(30);
		myHashSet.add(100);
		System.out.println(myHashSet.containsAll(Arrays.asList(15,25,35))); //Check 15,25,35 available in list result True/False.
		myHashSet.addAll(Arrays.asList(1000,2000,3000)); //addAll()
		System.out.println("addAll():"+myHashSet);
		
		//myHashSet.retainAll(Arrays.asList(1000,2000,3000));   //retain()-->only new list iteam is Present,Old iteam are deleted.  
		//System.out.println("Using retainsAll(): "+myHashSet);
		
		myHashSet.removeAll(Arrays.asList(1000,2000,3000)); //removeAll()
		System.out.println("removeAll():"+myHashSet);
		
		myHashSet.clear();
		System.out.println("Using Clear(): "+myHashSet);
	
		
	}

}
