

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
