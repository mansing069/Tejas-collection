package HashSetDemo_1_3_2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//linkedHashSet
//Maintain Ordered collection
//Doesnot allowed duplicate element
//maintain insertion order
//"null" is allowed


public class LinkedHashSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> myHashSet = new LinkedHashSet<>();
		
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
	}
}
