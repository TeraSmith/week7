import java.util.*;
import java.io.*;
	public class driver {
		
		public static void main(String[] args) {
			//main method
			ArraySt stack = new ArraySt(10);
			
			stack.push(1);
			stack.push(7);
			stack.push(3);
			stack.push(4);
			stack.push(9);
			stack.push(2);
			
			//Linked stack
			LinkedStack stackk = new LinkedStack();
			
			stackk.push(1);
			stackk.push(7);
			stackk.push(3);
			stackk.push(4);
			stackk.push(9);
			stackk.push(2);
			
			//pop off from arraystack
			while (stack.size() !=0) {
				System.out.println(stack.pop());
			}
			System.out.println();
			//pop off LinkedStack
			while(stackk.size() !=0) {
				System.out.println(stackk.pop());
			}
			System.out.println();
		}
	}	
	
