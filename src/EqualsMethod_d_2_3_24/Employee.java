package EqualsMethod_d_2_3_24;

import java.util.Objects;

//Equal method--d-02-03-2024( part-1) 31 min video
//Equal method--d-04-03-2024
public class Employee {
	
	public int emp_id;
	public String name;
	public int age;
	
	
	public Employee(int emp_id,String name,int age) {
		this.emp_id=emp_id;
		this.name=name;
		this.age=age;
	}
	
	public Employee(int emp_id,int age) {
		this.emp_id=emp_id;
		this.age=age;
	}
	
	public Employee(int emp_id, String name) {
		this.emp_id=emp_id;
		this.name=name;
	} 
	
	public Employee( String name) {
		this.name=name;
	}
	public Employee() {
		
	}
	public int getemp_id(){return emp_id;}
	
	public void setemp_id(int emp_id) {this.emp_id= emp_id;}
	
	public String getName() {return name;}
	
	public void setName(String name) {this.name = name;}
			public String  toString() {
				return "Employee{"+
						"emp_id="+emp_id +
						"name='"+ name+ '\'' +
						'}';
			}
		
			
	//	public boolean equals(Object obj) {
	//		return (this ==obj);      //Condition-1 to check locations
	//	}
		
	@Override							//Condition-2 to check location And data same 
	public boolean equals(Object obj) {
		
		if(this== obj) {
			return true;
		}
		  //check if obj is object of Employee Class 
		if(!(obj instanceof Employee employee)) {
			return false;
		}
		 Boolean isEqual = emp_id == employee.emp_id
				&& age == employee.age
				&& Objects.equals(name,employee.name);
		 return true;
	}
	@Override
	public int hashCode() {
		return Objects.hash(emp_id,name,age);
	}
		
	}
 

