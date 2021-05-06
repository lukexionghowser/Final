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

}
