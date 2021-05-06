package Lab;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JTree;

import Lab.Node;

public class Tree {

	public Node root;

	public int size() {
		return size(root);
	}

	int size(Node node2) {
		if (node2 == null)
			return 0;
		else
			return (size(Node.left) + 1 + size(Node.right));
	}

	// Traverse tree
	public void traverseTree(Node node) {
		if (node != null) {
			traverseTree(Node.left);
			System.out.print(" " + Node.sData + "-" + Node.iData);
			traverseTree(Node.right);
		}
	}

	private boolean containsNodeRecursive(Node current, String value) {
		if (current == null) {
			return false;
		}
		if (value == Node.sData) {
			System.out.println(Node.sData + "-" + Node.iData);
			return true;
		}
		return value != Node.sData ? containsNodeRecursive(Node.left, value) : containsNodeRecursive(Node.right, value);
	}

	public boolean containsNode(String value) {
		return containsNodeRecursive(root, value);
	}

	// TRYING THESE METHODS
	private Node addRecursive(Node current, String value, int number) {
		if (current == null) {
			return new Node(value, number);
		}

		// Try manual
		if (Node.left == null) {
			Node.left = addRecursive(Node.left, value, number);
		} else if (Node.right == null) {
			Node.right = addRecursive(Node.right, value, number);
		} else if (Node.left == null) {
			Node.left = addRecursive(Node.left, value, number);
		} else if (Node.right == null) {
			Node.right = addRecursive(Node.right, value, number);
		} else if (Node.left == null) {
			Node.left = addRecursive(Node.left, value, number);
		} else if (Node.right == null) {
			Node.right = addRecursive(Node.right, value, number);
		} else if (Node.left == null) {
			Node.left = addRecursive(Node.left, value, number);
		} else if (Node.right == null) {
			Node.right = addRecursive(Node.right, value, number);
		} else if (Node.left == null) {
			Node.left = addRecursive(Node.left, value, number);
		} else {
			return current;
		}
		return current;
	}

	public void add(String value, int number) {
		root = addRecursive(root, value, number);
	}

	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(Node.left);

		// then recur on right subtree
		printPostorder(Node.right);

		// the node
		System.out.print(Node.sData + " ");

	}

	/* Given a binary tree, print its nodes in inorder */
	String printInorder(Node node) {
		if (node == null)
			return null;

		/* first recur on left child */
		printInorder(Node.left); // getting error here with dialogbox

		/* then print the data of node */
		System.out.print(Node.sData + " ");

		return printInorder(Node.right);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(Node.sData + " ");

		/* then recur on left sutree */
		printPreorder(Node.left);

		/* now recur on right subtree */
		printPreorder(Node.right);
	}

	// Wrappers over above recursive functions
	public void printPostorder() {
		printPostorder(root);
	}

	public String printInorder() {
		String x = printInorder(root);
		return x;
	}

	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}

	public String linealNotation() {
		StringBuilder line = new StringBuilder();
		linearize(line, root);
		return line.toString();
	}

	private void linearize(StringBuilder line, Node n) {
		if (n == null) {
			return;
		}
		line.append(n.sData);
		line.append("(");
		linearize(line, n.left);
		line.append(",");
		linearize(line, n.right);
		line.append(")");
	}

	public String getTreeCellRendererComponent(JTree tree, Object value, boolean isSelected, boolean expanded,
			boolean leaf, int row, boolean hasFocus) {
		String stringValue = tree.convertValueToText(value, isSelected, expanded, leaf, row, hasFocus);
		// setEnabled(tree.isEnabled());
		// check.setSelected(((CheckNode) value).isSelected());

		// label.setText(stringValue);

		return stringValue;
	}

	public void printPreorder() {
		printPreorder(root);
	}

}
