
public class ArrayStack {

	int [] arr;
	int n;
	int capacity;
	
	public ArrayStack(int cap) {
		capacity = cap;
		arr = new int [cap];
		n = 0;
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
