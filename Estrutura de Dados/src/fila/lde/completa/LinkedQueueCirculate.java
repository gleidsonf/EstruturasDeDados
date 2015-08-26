package fila.lde.completa;

public class LinkedQueueCirculate<Tipo> implements QueueLDE<Tipo> {

	/**
	 * OBERVACOES Nao vi nenhuma utilidade para o Frente e Calda. Para calcular
	 * o size so devolvi o tamanho e funcionou. Para todos os casos
	 */
	private int frente;
	private int calda;
	private int tamanho;
	private DNode header;
	private DNode trailer;

	public LinkedQueueCirculate() {
		header = new DNode();
		trailer = new DNode();
		header.setNext(trailer);
		header.setPrev(trailer);
		trailer.setPrev(header);
		trailer.setNext(header);
		tamanho = 0;
		frente = 0;
		calda = 0;
	}

	@Override
	public int size() {

		// return ((tamanho - frente + calda) % tamanho);

		return tamanho;
	}

	@Override
	public boolean isEmpty() {
		return (trailer.getPrev() == header);
	}

	@Override
	public void insertFirst(Tipo element) {
		DNode second = header.getNext();
		DNode first = new DNode(element, header, second);
		second.setPrev(first);
		header.setNext(first);
		tamanho++;
		calda = (calda + 1) % tamanho;

	}

	@Override
	public void insertLast(Tipo element) {
		DNode second = trailer.getPrev();
		DNode first = new DNode(element, second, trailer);
		trailer.setPrev(first);
		second.setNext(first);
		tamanho++;
		calda = (calda - 1 + tamanho) % tamanho;
		// caldaA = (caldaA - 1 + tamanho) % tamanho;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Tipo removeFirst() throws DequeEmptyException {
		if (isEmpty()) {
			throw new DequeEmptyException("Deque Empty");
		}
		Tipo element = (Tipo) header.getNext().getElement();
		DNode first = header.getNext().getNext();
		header.setNext(first);
		first.setPrev(header);
		tamanho--;
		frente = (frente + 1) % tamanho;
		return element;

	}

	@SuppressWarnings("unchecked")
	@Override
	public Tipo removeLast() throws DequeEmptyException {
		if (isEmpty()) {
			throw new DequeEmptyException("Deque Empty");
		}
		Tipo element = (Tipo) trailer.getPrev().getElement();
		DNode last = trailer.getPrev().getPrev();
		trailer.setPrev(last);
		last.setNext(trailer);
		tamanho--;
		frente = (frente - 1 + tamanho) % tamanho;
		// frenteA = (frenteA - 1 + tamanho) % tamanho;
		return element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Tipo first() throws DequeEmptyException {
		if (isEmpty()) {
			throw new DequeEmptyException("Deque Empty");
		}
		return (Tipo) header.getNext().getElement();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Tipo last() throws DequeEmptyException {
		if (isEmpty()) {
			throw new DequeEmptyException("Deque Empty");
		}
		return (Tipo) trailer.getPrev().getElement();
	}

	public boolean contains(Tipo element) {
		DNode aux = header.getNext();
		while (aux != trailer) {
			if (aux.getElement().equals(element)) {
				return true;
			}

			aux = aux.getNext();
		}

		return false;
	}

	public void imprimir() {
		DNode aux = header.getNext();
		while (aux != trailer) {
			System.out.println(aux.getElement());
			aux = aux.getNext();
		}
	}

	public Object get(int indice) {
		DNode aux = header.getNext();
		for (int i = 0; i < indice-1; i++) {
			aux = aux.getNext();
		}

		return aux.getElement();
	}
}
