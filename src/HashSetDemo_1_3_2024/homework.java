package HashSetDemo_1_3_2024;

import java.util.ArrayList;
import java.util.Arrays; 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer>myHashSet =new ArrayList<>(); // Using List--
		//Set<Integer>myHashSet =new HashSet<>(); //using hashset--unordered collection
		Set<Integer>myHashSet =new LinkedHashSet<>(); //using hashset--ordered collection
		
			myHashSet.add(80);
			myHashSet.add(50);
			myHashSet.add(30);
			myHashSet.add(100);
		 	myHashSet.add(null); 
			myHashSet.add(80);
			myHashSet.add(50);
			myHashSet.add(30);
			myHashSet.add(100);
			System.out.println(myHashSet);
			
			System.out.println(myHashSet.containsAll(Arrays.asList(30,50,80)));  // result is true if all available
			System.out.println(myHashSet);
	}

}
