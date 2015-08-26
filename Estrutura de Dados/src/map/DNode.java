package map;

public class DNode {
	private Object element;
	private Object key;
	private DNode next;
	private DNode prev;

	public DNode() {
		this.element = null;
		this.key = null;
		this.next = null;
		this.prev = null;
	}

	public DNode(Object element, Object key, DNode next, DNode prev) {
		this.element = element;
		this.key = key;
		this.next = next;
		this.prev = prev;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

}
