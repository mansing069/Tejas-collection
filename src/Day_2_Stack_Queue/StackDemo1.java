package Day_2_Stack_Queue;

import java.util.Stack;
//27-2-2024- Stack-video-3

public class StackDemo1 {
	public static void main(String[]args) {
		Stack<Integer> stack =new Stack<>();
		System.out.println(stack.empty());
		System.out.println(stack.size());
		
		if(!stack.empty()) {         //type-2
			int element =stack.pop();
			System.out.println("return and remove :"+element);
			System.out.println(stack);
		}
		
		if(!stack.empty()) {		//type-3
			int element =stack.peek();
			System.out.println("returned element is:"+element);
			System.out.println(stack);
		}
		
	
	System.out.println(stack);
	stack.pop();     			//type1
	System.out.println(stack);  //type1
	
//	int element=stack.pop(); 	//type2 
//	System.out.println("remove"+element); //type2
	
	int element=stack.peek(); 	//type3 
	System.out.println("remove"+element); //type3
	
	System.out.println(stack.search(Integer.valueOf(50))); //type4
	}

}
