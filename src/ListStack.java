
//Tingting He
//CSC 130 Project1
import java.util.EmptyStackException;

//Implement your own linked list nodes and build a stack out of those, similar
//to the slides from lecture 1. Both ArrayStack and ListStack should throw an
//EmptyStackException if pop() or peek() is called when the stack is empty.

public class ListStack implements DStack {

	private class Node {
		private double data;
		private Node next; // the next Node

		public Node(double data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node root; // root Node, the first saved element

	public void push(double data) {
		Node newNode = new Node(data);
		newNode.next = root;
		root = newNode;
	}

	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;
	}

	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return root.data;
	}

	public void pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		root = root.next;
	}

}
