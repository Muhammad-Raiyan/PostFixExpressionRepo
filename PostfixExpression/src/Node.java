
public class Node {
	private Object element;
	private Node next;
	
	Node() {
		this(null, null);
	}
	
	Node(Object e, Node n){
		element = e;
		next = n;
	}
	
	Object getElement(){
		return element;
	}
	
	Node getNext(){
		return next;
	}
}
