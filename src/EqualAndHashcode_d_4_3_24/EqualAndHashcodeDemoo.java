package EqualAndHashcode_d_4_3_24;

import javax.sound.midi.Soundbank;

import Tejas_List_Collection_list_Array.Employee;

// class Date=6-3-2024
// Equal() and Hashcode

public class EqualAndHashcodeDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		Employee e1 =new Employee(101,"ABC",25);    // check before run,, new data required. 
		Employee e2 =new Employee (101,"ABC",26);
		System.out.println(e1.equals(e2));
*/		
		EqualsMethod_d_2_3_24.Employee e3 =new Employee(101,"ABC");
		EqualsMethod_d_2_3_24.Employee e4 =new Employee(101,"ABC");
		
		System.out.println("if Two object are Equals()method.then there hashcode must be same. ");
		System.out.println(e3.equals(e4));
		System.out.println("e3:"+e3.hashCode());
		System.out.println("e4:"+e4.hashCode());
		
		EqualsMethod_d_2_3_24.Employee e1 =new Employee(101,"Fo");     
		EqualsMethod_d_2_3_24.Employee e2 =new Employee (101,"En");

	
		System.out.println("if object have same Hashcode It does not mean that they are Equals.");
		System.out.println(e1.equals(e2));
		System.out.println("e1:"+e1.hashCode());
		System.out.println("e2:"+e2.hashCode());
		
		//video--8.23 min
		
		
		System.out.print("Index e1: ");
		System.out.println(e1.hashCode()&(16-1));
		
		System.out.print("Index e2: ");
		System.out.println(e2.hashCode()&(16-1));
		
		System.out.print("Index e3: ");
		System.out.println(e3.hashCode()&(16-1));
		
		System.out.print("Index e4: ");
		System.out.println(e4.hashCode()&(16-1));
		
		
		 
		
	}

}
