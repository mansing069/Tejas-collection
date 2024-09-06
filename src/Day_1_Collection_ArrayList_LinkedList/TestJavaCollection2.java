package Day_1_Collection_ArrayList_LinkedList;

//	LinkedList

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {
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
