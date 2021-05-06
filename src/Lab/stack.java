package Lab;

import java.util.Stack;

public class stack {

	private static int arr[];
	private static int top;
	private static int capacity;

	// Constructor to initialize the stack
	public stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element `x` to the stack
	public static void push(int x) {
		if (isFull()) {
			System.out.println("Overflow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Utility function to pop a top element from the stack
	public static int pop() {
		// check for stack underflow
		if (isEmpty()) {
			System.out.println("Underflow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + peek());

		// decrease stack size by 1 and (optionally) return the popped element
		return arr[top--];
	}

	// Utility function to return the top element of the stack
	public static int peek() {
		if (!isEmpty()) {
			return arr[top];
		} else {
			System.exit(1);
		}

		return -1;
	}

	// Utility function to return the size of the stack
	public int size() {
		return top + 1;
	}

	// Utility function to check if the stack is empty or not
	public static Boolean isEmpty() {
		return top == -1; // or return size() == 0;
	}

	// Utility function to check if the stack is full or not
	public static Boolean isFull() {
		return top == capacity - 1;
	}

	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {

			int tmp = input.pop();

			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {

				input.push(tmpStack.pop());
			}

			tmpStack.push(tmp);
		}
		return tmpStack;
	}

	public static Stack<Integer> sort(Stack<Integer> stack) {

		if (stack.isEmpty()) {
			return null;
		}

		Stack<Integer> sortedStack = new Stack<Integer>();

		int element = 0;
		while (!stack.isEmpty()) {
			if (stack.peek() <= (element = stack.pop())) {
				if (sortedStack.isEmpty()) {
					sortedStack.push(element);
				} else {
					while ((!sortedStack.isEmpty()) && sortedStack.peek() > element) {
						stack.push(sortedStack.pop());
					}
					sortedStack.push(element);
				}
			}
		}

		return sortedStack;
	}

}
