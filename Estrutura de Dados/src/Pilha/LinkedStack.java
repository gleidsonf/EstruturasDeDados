package Pilha;

public class LinkedStack implements Stack {
	private Node top; // reference to the head node
	private int size; // number of elements in the stack

	public LinkedStack() { // initializes an empty stack
		top = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (top == null)
			return true;
		return false;
	}

	public void push(Object elem) {
			top = new Node(elem, top);
		size++;
	}

	public Object top() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is empty.");
		return top.getElement();
	}

	public Object pop() throws StackEmptyException {
		if (isEmpty())
			throw new StackEmptyException("Stack is empty.");
		Object temp = top.getElement();
		top = top.getNext(); // link-out the former top node
		size--;
		return temp;
	}

	public static void main(String args[]) {
		LinkedStack A1 = new LinkedStack();

		Integer[] a = new Integer[10];
		Integer b = new Integer(4);
		Integer c = new Integer(9);

		A1.push(new Integer(3));
		A1.push(b);
		A1.push(c);

		System.out.println(A1.pop() + "\n" + A1.pop() + "\n" + A1.pop() + "\n");
		if (A1.isEmpty())
			System.out.println("A Pilha esta VAZIA... ");
	}

}