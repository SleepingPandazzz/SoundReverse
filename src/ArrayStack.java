
//Tingting He
//CSC 130 Project1
import java.util.EmptyStackException;

//Start with an array of size 10 elements and resize to use an array twice as large
//as whenever the array becomes full, copying over the elements in the smaller array.
//Do the copy with a loop. Either write a separate private helper method, or just
//put the code in directly. Using the length property of an array is fine.
//check peek() and pop()
public class ArrayStack implements DStack {

	private double[] theArray;
	private int top;
	private int size = 10;

	public ArrayStack() {
		theArray = new double[size];
		top = -1;
	}

	public void push(double data) {
		if (top == size - 1) {
			double[] array = new double[size];
			for (int i = 0; i < size; i++) {
				array[i] = theArray[i];
			}
			theArray = new double[2 * size];
			for (int i = 0; i < size; i++) {
				theArray[i] = array[i];
			}
			size = size * 2;
			theArray[++top] = data;
		} else {
			theArray[++top] = data;
		}
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public double peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return theArray[top];
	}

	public void pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		top--;
	}

}
