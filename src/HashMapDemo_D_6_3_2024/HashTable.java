package HashMapDemo_D_6_3_2024;
//Hashtable ->null Key &null vaull value is not allowed.
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Map<Integer, String> myMap= new TreeMap<>();
	
	myMap.put(1,"One");
	myMap.put(2,null);		//null is added in value without Doubleinverter Bracket(" ")
	myMap.put(3,"three");
	myMap.put(4,null);	 	//null is added in value without Doubleinverter Bracket(" ")
	//myMap.put(null,"Five");
			
	System.out.println(myMap);
			
	Dictionary<Integer,String>hashtable= new Hashtable<>();
	hashtable.put(1,null);   // throw NullPointerException(because Hashtable ->null value is not allowed.
	
}
}


