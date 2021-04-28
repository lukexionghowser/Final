package Lab;

public class Node {
	
	 static String data;
	   static Node next;
	    Node(String string)
	    {
	        data = string;
	        next = null;
	    }
		public static String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}

}
