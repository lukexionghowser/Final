/***************************************************************
* Name : StackXiong
* Author: Luke Xiong-Howser
* Created : 2/6/2020
* Course: CIS 152 - Data Structure
* Version: 1.0
* OS: Windows 10
* IDE: eclipse ide
* Copyright : This is my own original work 
* based on specifications issued by our instructor
* Description : Create Stack with array
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or
* unmodified. I have not given other fellow student(s) access
* to my program.
***************************************************************/


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
    	
    	////// STACK //////////
    	Random rand = new Random();
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	stack.push(rand.nextInt(15));
    	
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
        // try creating a queue and adding the pop() to it
        queue.enqueue(stack.pop());
        //System.out.println("Popped: " + stack.pop() );
        queue.enqueue(stack.pop());
        //System.out.println("Popped: " + stack.pop() );
        queue.enqueue(stack.pop());
        System.out.println("Remaining: " + stack );
        System.out.println("\nOdd queue: ");
    	queue.print();
    	
    	queue.peek();
    	
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
