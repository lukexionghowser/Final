import java.util.Random;
import java.util.Stack;

public class Practice {
	
	public static void main(String args[])
    {
		Random rand = new Random();
		Stack<Integer> stack = new Stack<>();
		
		int push1 = (rand.nextInt(5));
    	System.out.println("Push: " + push1);
    	stack.push(push1);
    	
    	int push2 = (rand.nextInt(5));
    	System.out.println("Push: " + push2);
    	stack.push(push2);
    	
    	int push3 = (rand.nextInt(5));
    	System.out.println("Push: " + push3);
    	stack.push(push3);
		
    	System.out.println("Pop: " + push3);
    	int total = 0;
    	total = (stack.pop() + stack.pop() + stack.pop());
    	
    	System.out.println(total); //this works
    	// not helpful for undefined # inside stack tho
		
    	
    	
    	
    	
    	
    	//while (stack != Stack.isEmpty()) {
    		
    	
    	
    	/*
		//int sum = 0;
		//while (stack.size()>0) sum += stack.pop();
    	int total = 0;
    	while(stack.size() > 0){
    		  total += stack.pop();
    		}
    	System.out.println(total);
    	    }
    	    */
    }
	

}
