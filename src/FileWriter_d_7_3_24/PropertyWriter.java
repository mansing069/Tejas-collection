package FileWriter_d_7_3_24;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//07-03-2024--FileWriter--Create new file(file Autogenerated) -->Add new record  File Record. time 42 min 

public class PropertyWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties defaultValues = new Properties(); // object create
		defaultValues.setProperty("username","DefaultUSERNAME"); //new value added
		defaultValues.setProperty("salary","25000");
		defaultValues.setProperty("manager","XYZ");
		
		FileWriter writer =new FileWriter("E:\\RAJESH-2\\Tejas limboli\\D-23-2-2024-COLLECTION TYPES\\D-07-03-2024-HashTable-propertirs-propertyReader_PropertyWrider\\fileWriter.txt");	// path of file save  
					//Data add in record so use FileWriter.					
					// file is autoGenerated, only create Name of file-->fileWriter
		defaultValues.store(writer,"some more details about users");
	}
 
}