 package HashMapDemo_D_6_3_2024;

//TreeMap with Put Method( D-6-3-2024-TreeMap-->28 min)

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<Integer, String> myMap= new TreeMap<>();
	//myMap.put(null,"Five"); //Format
	myMap.put(1,"One");
	myMap.put(2,null);		//null is added in value without Doubleinverter Bracket(" ")
	myMap.put(3,"three");
	myMap.put(4,null);	 	//null is added in value without Doubleinverter Bracket(" ")
	
			
	System.out.println(myMap);
			
	myMap.put(null, "Modified Three");
	System.out.println(myMap);		
	
	
	System.out.println("Hashcode number: " +myMap.hashCode());

}
}

