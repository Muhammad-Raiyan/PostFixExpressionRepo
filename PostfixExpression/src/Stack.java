
public interface Stack {
	
	void push(Object x);
	Object pop() throws StackException;
	Object top() throws StackException;
	void makeEmpty();
	boolean isEmpty();
	int size();
}
