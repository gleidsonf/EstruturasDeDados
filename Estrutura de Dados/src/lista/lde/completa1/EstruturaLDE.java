package lista.lde.completa1;

public class EstruturaLDE<Tipo> implements LDE<Object> {
	private DNode head;
	private DNode trailer;
	private Object dado;
	private int size;

	public EstruturaLDE() {
		this.head = new DNode();
		this.trailer = new DNode();
		this.dado = null;
		this.size = 0;
		head.setNext(trailer);
		trailer.setPrev(head);
	}

	@Override
	public void insertLast(Object obj) {
		DNode ant = trailer.getPrev();
		DNode last = new DNode(obj, ant, trailer);
		trailer.setPrev(last);
		ant.setNext(last);
		size++;
	}

	@Override
	public void insertFirst(Object obj) {
		DNode second = head.getNext();
		DNode first = new DNode(obj, head, second);
		second.setPrev(first);
		head.setNext(first);
		size++;
	}

	@Override
	public Object removeFirst() {
		Object dado = this.head.getNext().getDado();
		this.head.setNext(head.getNext().getNext());
		size--;
		return dado;
	}

	@Override
	public Object removeLast() {

		DNode last = trailer.getPrev();
		Object dado = last.getDado();
		DNode secondToLast = last.getPrev();
		trailer.setPrev(secondToLast);
		secondToLast.setNext(trailer);
		size--;
		return dado;
	}

	@Override
	public Object first() {

		return head.getNext().getDado();
	}

	@Override
	public Object last() {

		return trailer.getPrev().getDado();
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	public void imprimir() {
		DNode aux = this.head.getNext();
		while (aux != trailer) {
			System.out.println(aux.getDado());
			aux = aux.getNext();
		}
	}
	
	public Object getDado() {
		return dado;
	}
	
	

	public void setDado(Object dado) {
		this.dado = dado;
	}

	public int getSize() {
		return size;
	}

}
