package Lab;

import java.util.Queue;

public class queue {
	private static int front, rear, MAX_QUEUE_SIZE; 
    private static int queue[]; 
  
    public queue(int c) 
    { 
        front = rear = 0; 
        MAX_QUEUE_SIZE = c;
        queue = new int[MAX_QUEUE_SIZE]; 
    } 
  
    // function to insert an element 
    // at the rear of the queue 
    public static void enqueue(int data) 
    { 
        // check queue is full or not 
    	if (MAX_QUEUE_SIZE == rear) {
            System.out.printf("\nQueue is full\n"); 
            return; 
        } 
  
        // insert element at the rear 
        else { 
            queue[rear] = data; 
            rear++; 
        } 
        return; 
    } 
  
    // function to delete an element 
    // from the front of the queue 
    public static void dequeue() 
    { 
        // if queue is empty 
        if (front == rear) { 
            System.out.printf("\nQueue is empty\n"); 
            return; 
        } 
  
        // shift all the elements from index 2 till rear 
        // to the right by one 
        else { 
            for (int i = 0; i < rear - 1; i++) { 
                queue[i] = queue[i + 1]; 
            } 
  
            // store 0 at rear indicating there's no element 
            if (rear < MAX_QUEUE_SIZE) 
                queue[rear] = 0; 
  
            // decrement rear 
            rear--;
        } 
        return; 
    } 
  
    // print queue elements 
    public static void print() 
    { 
        int i; 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
  
        // traverse front to rear and print elements 
        for (i = front; i < rear; i++) { 
            System.out.printf("[ %d ]", queue[i]); 
        } 
        return; 
    } 
  
    // print front of queue 
    public static void peek() 
    { 
        if (front == rear) { 
            System.out.printf("\nQueue is Empty\n"); 
            return; 
        } 
        System.out.printf("\nFront Element is: %d", queue[front]); 
        return; 
    } 
    // method to return false/true if full
    public boolean isFull()
    {
    	return (size() == MAX_QUEUE_SIZE);
    }
    // method returns false/true if empty
    public boolean isEmpty() 
    {
    	return (size() == 0);
    }
    // method to check size
    public int size() 
    {
    	return rear;
    }


}
