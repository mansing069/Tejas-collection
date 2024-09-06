package HashSetDemo_1_3_2024;

import java.util.Set;
//TreeSet
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myHashSet = new TreeSet<>();
	
		myHashSet.add(80);
		myHashSet.add(50);
		myHashSet.add(30);
		myHashSet.add(100);
	
		
		System.out.println(myHashSet);
	}
}

//output--> Result in Sorted Order(Asending Order-30,50,80,100)