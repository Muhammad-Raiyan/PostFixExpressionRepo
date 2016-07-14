
public class LinkedStack implements Stack{
	
	private Node top;
	private int size;
	
	public LinkedStack(){
		top = null;
		size = 0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {
		return top == null;
	}
	
	@Override
	public void makeEmpty() {
		top = null;
		size = 0;
	}
	
	@Override
	public void push(Object x) {
		Node n = new Node(x, top);
		top = n;
		size++;
	}

	@Override
	public Object pop() throws StackException {
		Object temp;
		if(isEmpty()) throw new StackException("Stack is Empty");
		temp = top.getElement();
		top = top.getNext();
		size--;
		return temp;
	}

	@Override
	public Object top() throws StackException {
		if(isEmpty()) throw new StackException("Stack is empty");
		return top.getElement();
	}
	
	public String toString(){
		String out = "";
		Node current = top;
		while(!this.isEmpty()){
			out += (current.getElement() + "\n");
			current = current.getNext();
		}
		
		return out;
	}

}
