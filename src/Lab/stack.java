package Lab;

public class stack {
	
	private int arr[];
    private int top;
    private int capacity;
 
    // Constructor to initialize the stack
    public stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    // Utility function to add an element `x` to the stack
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
 
    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
 
        System.out.println("Removing " + peek());
 
        // decrease stack size by 1 and (optionally) return the popped element
        return arr[top--];
    }
 
    // Utility function to return the top element of the stack
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(1);
        }
 
        return -1;
    }
 
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }
 
    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;               // or return size() == 0;
    }
 
    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
	
	
	/*
	// Members
	private int top;  // TODO
	private int maxSize; // TODO 
	private String stackItems[]; 
	
	public stack() {
		this.maxSize = 5; 
		this.top = -1; 
		this.stackItems = new String[maxSize];
	}

	 // @param maxSize - sets maximum size of the stack 
	 
	public stack(int maxSize) {
		this.maxSize = maxSize;
		this.top = -1; 
		this.stackItems = new String[maxSize];
	}

	public boolean isFull() {
		return top == maxSize -1; // TODO 
	}

	public boolean isEmpty() {
		// TODO 
		return false;  // Possibly you will remove this line, this is for running Unit Tests before writing code

	}

	public int size() {
		// TODO 
		return -1;  // Possibly you will remove this line, this is for running Unit Tests before writing code

	}

	public String peek() throws StackEmptyException{
		if (! this.isEmpty()) 
			return stackItems[top];
		throw new StackEmptyException(null); 
	}
	

	public String pop() {
		String item = null; 
		// TODO
		return item; // Possibly you will remove this line, this is for running Unit Tests before writing code
	}	
	

	public void push(String item) {
		//TODO
		
	}
	
	public String printStackUp() {
		String stackString = new String(); 
		// TODO
		return stackString; // Possibly you will remove this line, this is for running Unit Tests before writing code
	}
*/
}
