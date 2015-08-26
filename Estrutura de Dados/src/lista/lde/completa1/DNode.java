package lista.lde.completa1;

public class DNode {

private	DNode prev;
private DNode next;
private Object dado;

	public DNode() {
		this.prev = null;
		this.next = null;
		this.dado = null;
	}

	public DNode(Object dado, DNode prev, DNode next) {
		this.prev = prev;
		this.next = next;
		this.dado = dado;
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

	public Object getDado() {
		return dado;
	}

	public void setDado(Object dado) {
		this.dado = dado;
	}

}
