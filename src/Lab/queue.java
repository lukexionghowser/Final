package Lab;

import java.util.Queue;
import java.util.Random;

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
    public static int peek() 
    { 
    	//genQue();
        if (front == rear) { 
            //System.out.printf("\nQueue is Empty\n"); 
            return 0; 
        } 
        //System.out.printf("\nFront Element is: %d", queue[front]); 
        return queue[front]; 
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
    public static int size() 
    {
    	return rear;
    }

    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    public static int num1() {
    	Random rand = new Random();
    	int num = rand.nextInt(10);
    	return num;
    }
    public static int num2() {
    	Random rand = new Random();
    	int num = rand.nextInt(10);
    	return num;
    }
    public static String equation() {
    	Random rand = new Random();
    	int numOne = rand.nextInt(10);
    	int numTwo = rand.nextInt(10);
    	//int numOne = num1().toString();
    	//int numTwo = num2();
    	int answer = numOne + numTwo;
    	String equation = numOne + " + " + numTwo + " = ";
    	//System.out.println(num1()+ num2());
    	return equation;
    	
    }
    public static void genQue() {
    	int MAX_QUEUE = 5;
    	queue q = new queue(MAX_QUEUE); 

    	Random rand = new Random();
    	
    	int push1 = (rand.nextInt(10));
    	enqueue(push1);
    	
    	int push2 = (rand.nextInt(10));
    	enqueue(push2);
    	
    	int push3 = (rand.nextInt(10));
    	enqueue(push3);
    	
    	int push4 = (rand.nextInt(10));
    	enqueue(push4);
    	
    	int push5 = (rand.nextInt(10));
    	enqueue(push5);
    	
    	return;
    	
    	//int num = peek();
    }

}
