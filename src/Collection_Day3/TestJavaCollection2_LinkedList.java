package Collection_Day3;

import java.util.Iterator;
import java.util.LinkedList;

//Collection interface->A)LinkedList


public class TestJavaCollection2_LinkedList {
	
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();  
		al.add("ABC");  
		al.add("XYZ");  
		al.add("PQR");  
		al.add("ABC");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
	}	

}
