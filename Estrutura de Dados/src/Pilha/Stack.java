package Pilha;

public interface Stack {
	/**
	 * @return number of elements in the stack.
	 */
	public int size();

	/** * @return true if the stack is empty, false otherwise. */
	public boolean isEmpty();

	public Object top() throws StackEmptyException;

	public void push(Object element);

	public Object pop() throws StackEmptyException;
}
