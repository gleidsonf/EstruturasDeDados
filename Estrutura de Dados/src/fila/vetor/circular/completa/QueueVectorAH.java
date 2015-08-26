package fila.vetor.circular.completa;

import fila.arranjo.QueueEmptyException;

public class QueueVectorAH<Tipo> implements LinkedCirculateQueue<Tipo> {
	private int frente = 0;
	private int calda = 0;
	private int tamanho;
	public static final int CAPACIDADE = 100;
	private Object vetor[];

	public QueueVectorAH() {
		tamanho = CAPACIDADE;
		vetor = new Object[tamanho];
	}

	public QueueVectorAH(int capacidade) {
		tamanho = capacidade;
		vetor = new Object[tamanho];
	}

	@Override
	public int size() {
		return ((tamanho + frente - calda) % tamanho);
	}

	@Override
	public boolean isEmpty() {
		return (tamanho == calda);
	}

	@Override
	public Object front() throws QueueEmptyException {
		return vetor[frente];
	}

	@Override
	public void enqueue(Object element) {
		vetor[calda] = element;
		calda = (calda - 1 + tamanho) % tamanho;

	}

	@Override
	public Object dequeue() throws QueueEmptyException {
		Object elem;
		if (isEmpty())
			throw new QueueEmptyException("Queue is Empty.");
		elem = vetor[frente];
		vetor[frente] = null; // dereference Q[f] for garbage collection.
		frente = (frente - 1 + tamanho) % tamanho;
		return elem;
	}

	public void imprimir() {

		int i = (tamanho+frente-1)%tamanho;
	 	while (i != ((tamanho+calda)%tamanho)) {
	 		System.out.println(vetor[i]);
	 		i = (tamanho+i-1)%tamanho;
	 	}
	}
}
