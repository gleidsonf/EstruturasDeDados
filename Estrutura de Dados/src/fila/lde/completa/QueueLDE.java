package fila.lde.completa;


public interface QueueLDE<Tipo> {
	int size();

	boolean isEmpty();

	void insertFirst(Tipo element);

	void insertLast(Tipo element);
	
	Tipo removeFirst() throws DequeEmptyException;

	Tipo removeLast() throws DequeEmptyException;

	Tipo first() throws DequeEmptyException;

	Tipo last() throws DequeEmptyException;
}
