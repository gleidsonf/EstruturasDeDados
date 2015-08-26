package fila.lde.completa;

public class DNode {
	private DNode prev;
	private DNode next;
	private Object element;

	public DNode() {
		this.prev = null;
		this.next = null;
		this.element = null;
	}

	DNode(Object element, DNode prev, DNode next) {
		this.prev = prev;
		this.next = next;
		this.element = element;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

}
