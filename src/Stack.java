

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import Lab.InsertionSort;
import Lab.StackEmptyException;
import Lab.stack;
import Lab.queue;

public class Stack <E>{
	
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
    public String toString()
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < MAX_STACK_SIZE ;i++) {
             sb.append(elements[i].toString());
             if(i < MAX_STACK_SIZE-1){
                 sb.append(",");
                 
             }
         }
         sb.append(']');
         return sb.toString();
    }
    
    public static void main(String[] args) 
    { 
    	
    	Stack<Integer> stack = new Stack<>();
    	
    	System.out.println("Adding random numbers to stack...");
    	
    	////// STACK //////////
    	Random rand = new Random();
    	
    	int push1 = (rand.nextInt(15));
    	System.out.println("Push: " + push1);
    	stack.push(push1);
    	
    	int push2 = (rand.nextInt(15));
    	System.out.println("Push: " + push2);
    	stack.push(push2);
    	
    	int push3 = (rand.nextInt(15));
    	System.out.println("Push: " + push3);
    	stack.push(push3);
    	
    	int push4 = (rand.nextInt(15));
    	System.out.println("Push: " + push4);
    	stack.push(push4);
    	
    	int push5 = (rand.nextInt(15));
    	System.out.println("Push: " + push5);
    	stack.push(push5);
    	
    	/*
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	*/
    	
    	System.out.println("The stack is now generated!");
    	    	
    	/////// QUEUE ////////
    	int MAX_QUEUE = 5;
    	queue q = new queue(MAX_QUEUE); 
    	System.out.println("Queue size: " + MAX_QUEUE);
    	/*
    	int i = 0;
    	while (i < MAX_QUEUE) {
			// fill customer queue with random number
    		queue.enqueue(i);
    		i++;
    	}*/
    	//System.out.println("Number of Odds: " + tickets);
    	//System.out.println("Queue size: " + q.size());
    	System.out.println("Contents in queue: ");
    	queue.print();
    	
    	/*//rest of Queue code below
    	// create while ticket / cust queue != 0 dequeue
    	while (tickets > 0 && q.size()>0) {
    	q.dequeue();
    	int bought = rand.nextInt(4);
    	tickets = tickets - bought;
    	System.out.println("Customer bought: " + bought + " Remaining: " + tickets);
    	System.out.println("\nRemaining Customers: ");
    	q.print();*/
    	//////////////////////////////////////////////
         
        System.out.println("Stack Contents: " + stack);
         
        //System.out.println("Popped: " + stack.pop() );
        System.out.println("Now popping numbers from stack into queue.");
        // created a queue and adding to it from stack.pop()
        queue.enqueue(stack.pop());
        System.out.println("POP!");
        //System.out.println("Popped: " + stack.pop() );
        queue.enqueue(stack.pop());
        System.out.println("POP!");
        //System.out.println("Popped: " + stack.pop() );
        queue.enqueue(stack.pop());
        System.out.println("POP!");
        System.out.println("Remaining in stack: " + stack );
        System.out.println("\nPopped stack numbers NOW in queue: ");
    	queue.print();
    	
    	queue.peek();
    	
    	//////////trying to convert queue to array below to sort
    	/*
    	int[] arr = reverse(queue.stream().mapToInt(Integer::intValue).toArray());
    	
    	int[] res = queue.stream().mapToInt(Integer::intValue).toArray();
    	
    	
    	int[] i = { queue.size() };
    	int[] array = new int[i[0]];
    	queue.forEach(n -> array[--i[0]] = n);
    	*/
    	/////////////////////////////////////////
    	
    	//int[] arr = queue.toArray(); //error
    	
    	// apply insertion sort
    	/*
    	System.out.println("Insertion Sort Odd Numbers:");  
        InsertionSort.printOdds(q);
        */
    	
    	/*
        try
        { 
            // Throw an object of user defined exception 
            throw new StackEmptyException("This is the Exception"); 
        } 
        catch (StackEmptyException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
        */
    }
    

}
