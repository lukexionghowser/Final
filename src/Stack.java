
import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import Lab.InsertionSort;
import Lab.StackEmptyException;
import Lab.stack;
import Lab.queue;

public class Stack<E> {

	private int MAX_STACK_SIZE = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private Object elements[];

	public Stack() {
		elements = new Object[DEFAULT_CAPACITY];
	}

	public void push(E e) {
		if (MAX_STACK_SIZE == elements.length) {
			ensureCapacity();
		}
		elements[MAX_STACK_SIZE++] = e;
	}

	@SuppressWarnings("unchecked")
	public E pop() {
		E e = (E) elements[--MAX_STACK_SIZE];
		elements[MAX_STACK_SIZE] = null;
		return e;
	}

	private void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for (int i = 0; i < MAX_STACK_SIZE; i++) {
			sb.append(elements[i].toString());
			if (i < MAX_STACK_SIZE - 1) {
				sb.append(",");

			}
		}
		sb.append(']');
		return sb.toString();
	}

	// Utility function to return the size of the stack
	public int size() {
		return 3;
	}

	public Boolean isEmpty() {
		return MAX_STACK_SIZE == -1; // or return size() == 0;
	}

	public int peek() { // needs to be int for sort
		int x = ((Integer) (elements[MAX_STACK_SIZE])).intValue();
		return x;
	}
	/*
	 * public Object peek() { //no errors but cant use in sort return
	 * elements[MAX_STACK_SIZE]; } /* public int peek() { //need to rewrite to use
	 * dec var return arr[top]; }
	 */

	public static Stack<Integer> sortstack(Stack<Integer> input) {
		Stack<Integer> tmpStack = new Stack<Integer>();
		while (!input.isEmpty()) {
// pop out the first element
			int tmp = input.pop();

// while temporary stack is not empty and
// top of stack is greater than temp
			while (!tmpStack.isEmpty() && tmpStack.peek() > tmp) {
// pop from temporary stack and 
// push it to the input stack
				input.push(tmpStack.pop());
			}

// push temp in tempory of stack
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
	/*
	 * // Recursive Method to insert an item x in sorted way static void
	 * sortedInsert(Stack<Integer> s, int x) { // Base case: Either stack is empty
	 * or newly // inserted item is greater than top (more than all // existing) if
	 * (s.isEmpty() || x > s.peek()) { s.push(x); return; }
	 * 
	 * // If top is greater, remove the top item and recur int temp = s.pop();
	 * sortedInsert(s, x);
	 * 
	 * // Put back the top item removed earlier s.push(temp); }
	 * 
	 * // Method to sort stack static void sortStack(Stack<Integer> s) { // If stack
	 * is not empty if (!s.isEmpty()) { // Remove the top item int x = s.pop();
	 * 
	 * // Sort remaining stack sortStack(s);
	 * 
	 * // Push the top item back in sorted stack sortedInsert(s, x); } }
	 */

	public static java.util.Stack<Integer> sort(java.util.Stack<Integer> evenList) {
		if (stack.isEmpty()) {
			return null;
		}

		java.util.Stack<Integer> sortedStack = new java.util.Stack<Integer>();

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
