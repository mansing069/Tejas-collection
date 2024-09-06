package FileReader_d_7_3_24;

//D-7/3/2024-PropertyReader-->Fetch data from filevia code
//we are change Data from file ,automatically change in the code,after Running code.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static void main(String []args)throws IOException {
/*		
// case1- Fetch the data from file automatically ,and run the code,to call All Data from file  		
	Properties myProperties = new Properties();
	
	FileReader reader =new FileReader("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileReader.txt");	// path of file save  // for FileNotFoundException

	 //Attched file path with file type.(fileReader.txt)
	
	myProperties.load(reader) ;	    // for IOException
	
	System.out.println(myProperties);
	
	
// case2- Fetch the SELECTED data from file automatically ,and run the code  
//  used getProperty() method
//  Fetch only one data--EmpId		
	
	
/*	Properties myProperties = new Properties();
	
	FileReader reader =new FileReader("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileReader.txt");// path of file save  // for FileNotFoundException
	 //Attched file path with file type.(fileReader.txt)
	
	myProperties.load(reader) ;	    // for IOException
	
	System.out.println(myProperties.getProperty("EmpId"));  //fetch only EmpId record
*/
		
// case3- Fetch the absent record in record.and get result
// D-7/3/2024-PropertyReader-->video-33 min	

/*	Properties myProperties = new Properties();
	
	FileReader reader =new FileReader("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileReader.txt");// path of file save  // for FileNotFoundException
	 //Attched file path with file type.(fileReader.txt)
	
	myProperties.load(reader) ;	    // for IOException
	
	System.out.println(myProperties.getProperty("UserName"));  //fetch Unknown record_UserName
*/	
	
	
// case4- if Record is not found then get "DefaultUserName" record
// D-7/3/2024-PropertyReader-->video-34 min	
// used .getProperty another method	
		Properties myProperties = new Properties();
		
		FileReader reader =new FileReader("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileReader.txt");// path of file save  // for FileNotFoundException
	 //Attched file path with file type.(fileReader.txt)
		
		myProperties.load(reader) ;	    // for IOException
		
		System.out.println(myProperties.getProperty("UserName","DefaultUserName"));  //fetch Unknown record_UserName,if record not found get "DefaultUserName" 
			
	
	}
		
}

