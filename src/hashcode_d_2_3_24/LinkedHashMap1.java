package hashcode_d_2_3_24;

//output--> null value not in sequencial order not in zero index.
import java.util.LinkedHashMap;
import java.util.Map;
//2-3-2024--TIME 30MIN video
//prog- HashCode

public class LinkedHashMap1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<Integer, String> myMap= new LinkedHashMap<>();   
	
	myMap.put(1,"One");
	myMap.put(2,null);		//null is added in value without Doubleinverter Bracket(" ")
	myMap.put(3,"three");
	myMap.put(4,null);	 	  
	myMap.put(null,"Five");
			
	System.out.println(myMap);
			
	myMap.put(null, "Modified Three");
	System.out.println(myMap);		
	
	System.out.println("Hashcode number: " +myMap.hashCode());

}
}

