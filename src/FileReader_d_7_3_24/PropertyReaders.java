package FileReader_d_7_3_24;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

// 07-03-2024--set DefaultValues in givenFileRecord. time 35 min 
public class PropertyReaders {

	public static void main(String []args)throws IOException {
		// TODO Auto-generated method stub

		Properties defaultValue = new Properties();
		defaultValue.setProperty("username","DefaultUSERNAME");
		defaultValue.setProperty("salary","25000");
		defaultValue.setProperty("manager","XYZ");
								
		Properties myProperties = new Properties(defaultValue);  //defaultValue is pass in this object.
		
		FileReader reader =new FileReader("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileReader.txt");	// path of file save  
		
		myProperties.load(reader) ;
		System.out.println(myProperties); // Data fetch via myProperties Objects
		
		
		System.out.println(myProperties.getProperty("username")); 	//Data fetch via username key 
		System.out.println(myProperties.getProperty("salary"));		//Data fetch via salary key
		System.out.println(myProperties.getProperty("manager"));	//Data fetch via manager key
		
		
	}

}	
