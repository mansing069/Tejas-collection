package EqualsMethod_d_2_3_24;
//Equal method--d-02-03-2024( part-2)
//Equal method--d-04-03-2024
public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee(101,"ABC",21);
		
		Employee e2 =new Employee(101,"ABC",21); //condition1 //new keyword- used for create new location of object.then result is false
//		Employee e2 =e1;   			//condition2 --same location e1=e2  then result is true
		
		System.out.println(e1==e2);  //memory location check, it is same or different.
	}

}
