package Pilha;

public class Node {
	// Instance variables:
	private Object element;
	private Node next;

	// Simple constructors:
	public Node() {
		this(null, null);
	}

	public Node(Object e, Node n) {
		element = e;
		next = n;
	}

	// Accessor methods:
	Object getElement() {
		return element;
	}

	Node getNext() {
		return next;
	}

	// Modifier methods:
	void setElement(Object newElem) {
		element = newElem;
	}

	void setNext(Node newNext) {
		next = newNext;
	}
}