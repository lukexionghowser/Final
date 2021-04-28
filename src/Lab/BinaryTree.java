package Lab;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import Lab.Node;

public class BinaryTree {

	static Node head;
	public BinaryTreeNode root;
	public static Stack<String> TripLog = new Stack<String>();
	

	// Function to insert a node at the beginning of
	// the Linked List
	public void push(String string) {
		// allocate node and assign data
		Node new_node = new Node(string);

		// link the old list off the new node
		new_node.next = head;

		// move the head to point to the new node
		head = new_node;
		
		
	}

	// converts a given linked list representing a
	// complete binary tree into the linked
	// representation of binary tree.
	public static BinaryTreeNode convertList2Binary(BinaryTreeNode node) {
		// queue to store the parent nodes
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

		// Base Case
		if (head == null) {
			node = null;
			return null;
		}

		// 1.) The first node is always the root node, and
		// add it to the queue
		node = new BinaryTreeNode(head.data);
		q.add(node);

		// advance the pointer to the next node
		head = head.next;

		// until the end of linked list is reached, do the
		// following steps
		while (head != null) {
			// 2.a) take the parent node from the q and
			// remove it from q
			BinaryTreeNode parent = q.peek();
			BinaryTreeNode pp = q.poll();

			// 2.c) take next two nodes from the linked list.
			// We will add them as children of the current
			// parent node in step 2.b. Push them into the
			// queue so that they will be parents to the
			// future nodes
			BinaryTreeNode leftChild = null, rightChild = null;
			leftChild = new BinaryTreeNode(head.data);
			q.add(leftChild);
			head = head.next;
			if (head != null) {
				rightChild = new BinaryTreeNode(head.data);
				q.add(rightChild);
				head = head.next;
			}

			// 2.b) assign the left and right children of
			// parent
			parent.left = leftChild;
			parent.right = rightChild;
		}

		return node;
	}

	// Utility function to traverse the binary tree
	// after conversion
	public static String inorderTraversal(BinaryTreeNode node) {
		//String a = "";
		//String b = "";
		//String c = "";
		if (node != null) {
			
			inorderTraversal(node.left);
			System.out.print(node.data + " ");
			//list.add(node.getData());
			//TripLog.add(node.data); //doesnt save elements
			inorderTraversal(node.right);
			/*
			a = inorderTraversal(node.left);
			b = (node.data + " ");
			c = inorderTraversal(node.right);
			*/
		}
		//confirmed this works
		//return "testing";
		//return a + b+ c;
		return null;
	}

}
