package fila.vetor.circular.completa;

import fila.arranjo.QueueEmptyException;

public interface LinkedCirculateQueue<Tipo> {

	int size();

	boolean isEmpty();

	Object front() throws QueueEmptyException;

	void enqueue(Tipo element);

	Object dequeue() throws QueueEmptyException;
}
