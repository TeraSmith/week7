import java.util.*;
import java.io.*;
	public class ArraySt {

		private int[] arr;
		private int n;
		private int capacity;


	public ArraySt(int cap) {

		capacity = cap;
		n = 0;
		arr = new int[cap];

	}

		public int size() {
			return n;

		}

		public void push(int item) {
			if(n == capacity)
			System.out.println("Stack is full");
			else {
			arr[n] = item;
			n++;

		}

	}
		public int pop() {
			int data = -999;
			if(n == 0)
				System.out.println("Stack is full");
			else {
				data = arr[n-1];
				n--;
	}	
		return data;

	}

}

	public class LinkedStack {

		class Node {

			int data;

			Node next;

			Node(int item) {

				data = item;

			}

		}

		private Node top;

		private int n;

		public LinkedStack() {

			top = null;

			n = 0;

		}

		public void push(int item) {

			Node newNode = new Node(item);

			newNode.next = top;

			top = newNode;

			n++;

		}  

		public int size() {

			return n;

		}

		public int pop() {

			if(n == 0) {

				return -999;

			}

			int data = top.data;

			top = top.next;

				n--;

				return data;

		}

	}
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
	