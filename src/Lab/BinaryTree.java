package Lab;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.w3c.dom.NodeList;

import Lab.Node;

public class BinaryTree {
/*
	static Node head;
	public BinaryTreeNode root;

	public void push(String string) {

		Node new_node = new Node(string);

		new_node.next = head;

		head = new_node;
	}

	public static BinaryTreeNode convertList2Binary(BinaryTreeNode node) {

		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		if (head == null) {
			node = null;
			return null;
		}

		node = new BinaryTreeNode(head.data);
		q.add(node);

		head = head.next;

		while (head != null) {

			BinaryTreeNode parent = q.peek();
			BinaryTreeNode pp = q.poll();

			BinaryTreeNode leftChild = null, rightChild = null;
			leftChild = new BinaryTreeNode(head.data);
			q.add(leftChild);
			head = head.next;
			if (head != null) {
				rightChild = new BinaryTreeNode(head.data);
				q.add(rightChild);
				head = head.next;
			}

			parent.left = leftChild;
			parent.right = rightChild;
		}

		return node;
	}
	
	public static void inorderTraversal(BinaryTreeNode node) {
		// String a = "";
		// String b = "";
		// String c = "";
		if (node != null) {

			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			//list.add(node.getData());
			// TripLog.add(node.data); //doesnt save elements
			inorderTraversal(node.right);
			
			  //a = inorderTraversal(node.left); b = (node.data + " "); c =
			  //inorderTraversal(node.right);
			 
		}
		// confirmed this works
		// return "testing";
		// return a + b+ c;
		// return null;
	}
	
	private int storeInOrder(Node root, Book[] array, int index) {
	    if (root == null)
	        return index;
	    // then call on left, add root, call on right...
	    int i = storeInOrder(root.next, array, index);
	    //array[i] = root.movie; // root.data doesn't work here
	    return storeInOrder(root.next, array, i+1);
	}
	
	
	
/* not for string
	int fill_array(Node root, int [] array, int pos) {
	    if (root.next != null) {
	        pos = fill_array(root.next, array, pos);
	    }
	    array[pos++] = root.data;
	    if (root.next != null) {
	        pos = fill_array(root.next, array, pos);
	    }
	    return pos; // return the last position filled in by this invocation
	}

	/*
	private static List<Integer> extractValues(Node n) {
	    List<Integer> result = new ArrayList<>();
	    if (n.left() != null) {
	        result.addAll(extractValues(n.left()));
	    }

	    if (n.right() != null) {
	        result.addAll(extractValues(n.right()));
	    }

	    result.add(n.getValue());

	    return result;
	}
	 public static Node[] convertToArray(NodeList list)
	  {
	      int length = list.getLength();
	      Node[] copy = new Node[length];
	      
	      for (int n = 0; n < length; ++n)
	          copy[n] = (Node) list.item(n);
	      
	      return copy;
	  }

	 */
	
	/*// this converts the node to an array
	public int [] toBSTArray() {
	    int size = 20; //ASSUMING THIS IS LESS THAN OR EQUAL TO NUMBER OF NODES IN THE TREE
	    int [] BSTarray = new int [size];
	    makeArray(root, 0, BSTarray);
	    return BSTarray;
	}

	//helper method called by toBSTArray
	public void makeArray(BinaryTreeNode node, int i, int [] BSTarray ) {
	    if (node != null) {
	        BSTarray[i] = root.getValue();   
	        makeArray(node.getLeft(), 2*i+1, BSTarray);
	        makeArray(node.getRight(), 2*i+2, BSTarray);
	   }
	}*/
	
	
}
