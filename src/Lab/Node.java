package Lab;


public class Node {
	
	static String str;
	static String sData; // represents string message
	static int iData; // represents place on top ten list
	public static Node left; // left child (left subtree)
	public static Node right; // right child (right subtree)

	public Node(String string, int number) {
		sData = string;
		iData = number;
		left = right = null;
	}
	
	/*
	static Node newNode(int data) 
	{ 
	    Node node = new Node(); 
	    node.data = data; 
	    node.left = node.right = null; 
	    return (node); 
	} 
	public static void treeToString(Node root) 
	{ 
	    // bases case 
	    if (root == null) 
	        return; 
	  
	    // push the root data as character 
	    str += (Character.valueOf((char) 
	           (root.iData + '0'))); 
	  
	    // if leaf node, then return 
	    if (root.left == null && root.right == null) 
	        return; 
	  
	    // for left subtree 
	    str += ('('); 
	    treeToString(root.left); 
	    str += (')'); 
	  
	    // only if right child is present to 
	    // avoid extra parenthesis 
	    if (root.right != null) 
	    { 
	        str += ('('); 
	        treeToString(root.right); 
	        str += (')'); 
	    } 
	}*/

}
