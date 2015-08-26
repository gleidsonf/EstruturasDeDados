package fila.dinamica;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue implements Queue {
	private Node head; // cabeça da fila
	private Node tail; // cauda da fila
	private int size; // tamanho da Fila

	/*--------------------------------------------------*/
	public LinkedQueue() {
		head = tail = null;
		size = 0;
	}

	// ///////////////////
	public int size() {
		return size;
	}

	/*--------------------------------------------------*/
	public boolean isEmpty() {
		return (size == 0);
	}

	/*--------------------------------------------------*/
	public Object front() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("Queue is empty.");
		return head.getElement();
	}

	/*--------------------------------------------------*/
	public void enqueue(Object obj) {
		Node node = new Node();
		node.setElement(obj);
		node.setNext(null); // node will be new tail node
		if (size == 0)
			head = node; // special case of a previously empty queue
		else
			tail.setNext(node); // add node at the tail of the list
		tail = node; // update the reference to the tail node
		size++;
	}

	// /////////
	public Object dequeue() throws QueueEmptyException {
		Object obj;
		if (size == 0)
			throw new QueueEmptyException("Queue is empty.");
		obj = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null; // the queue is now empty
		return obj;
	}

	// -------------Inverter uma Fila....
	public void inverter() {
		LinkedQueue Res = new LinkedQueue();

		int tam = this.size(), cont;
		System.out.println(tam);
		while (tam > 0) {

			cont = 1;
			while (tam > cont) {
				this.enqueue(this.dequeue());
				cont++;
			}

			Res.enqueue(this.dequeue());
			// System.out.println("Front " + Res.front());
			tam--;
		}

		this.head = Res.head;
		this.tail = Res.tail;
		this.size = Res.size;

	}

	// Imprimindo a Fila de Forma Recursiva
	public void imprimirR(int i) {

		if (i < this.size()) {
			System.out.print(this.front() + "  ");
			this.enqueue(this.dequeue());
			imprimirR(++i);
		}

	}

	// Imprimir acessando a Estrutura de Dados Diretamente...
	public void ImprimirAED() {
		Node Aux = head; // Aux apontar para frente
		while (Aux != null) {
			System.out.print(Aux.getElement() + "  ");
			Aux = Aux.getNext();
		}
	}

	// Copiar uma Fila Acessando os elementos internos da ED (Nós)

	public LinkedQueue Clone() {

		LinkedQueue Copia = new LinkedQueue();

		// caso fila com nenhum elemento
		if (isEmpty())
			return Copia;

		Node NoOr = this.head;
		Node AuxC = Copia.head = new Node(NoOr.getElement(), null);
		Copia.size = this.size;

		// caso fila com 1 elemento
		if (Copia.size == 1) {
			Copia.tail = Copia.head;
			return Copia;
		}

		while (NoOr.getNext() != null) {
			NoOr = NoOr.getNext();
			Copia.tail = new Node(NoOr.getElement(), null);
			AuxC.setNext(Copia.tail);
			AuxC = Copia.tail;
		}

		return Copia;

	}

	public static void main(String args[]) {
		LinkedQueue F = new LinkedQueue();
		F.enqueue(new Integer(1));
		F.enqueue(new Integer(10));
		F.enqueue(new Integer(100));
		F.enqueue(new Integer(1000));

		System.out.println(F.size());
		System.out.println(F.dequeue() + "  " + F.dequeue() + "  "
				+ F.dequeue() + "  " + F.dequeue());
		System.out.println(F.size());

		for (int i = 1; i < 10; i += 2)
			F.enqueue(new Integer(i));

		System.out.println("Elementos: " + F.size() + "\n");

		/*
		 * while(!F.isEmpty()) System.out.println(F.dequeue() + "  ");
		 * 
		 * System.out.println("Tamanho: " + F.size());
		 */

		// Exercicio do Clone

		LinkedQueue FAux = F.Clone();

		// Exercicio de Recursividade

		System.out.println("Imprimir Recursivo\n \n ");
		F.imprimirR(0);
		System.out.println("\n\n No. Elementos: " + F.size());

		System.out.println("Imprimir Recursivo  (Clone) \n \n ");
		FAux.ImprimirAED();

	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object element() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean offer(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove() {
		// TODO Auto-generated method stub
		return null;
	}

}
