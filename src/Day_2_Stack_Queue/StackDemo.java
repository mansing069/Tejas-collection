package Day_2_Stack_Queue;

import java.util.List;
import java.util.Stack;

//27-2-2024- Stack
public class StackDemo {
	public static void main(String[]args) {
		Stack<Integer> stack =new Stack<>();
		
		for(int i=10;i<101;) {
			stack.push(i); //push->add value
			i+=10;
		} 
	System.out.println(stack);
	stack.pop();    //type1 //remove last added value(element) from list(100)
	System.out.println(stack);  //type1
	
	int element=stack.pop(); //type2 //remove last added value from list(90)
	System.out.println("remove"+element); //type2
	
	}

}
