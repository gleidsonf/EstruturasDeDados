package fila.vetor.circular.completa;

import fila.arranjo.QueueEmptyException;
import fila.arranjo.QueueFullException;

public class QueueVector<Tipo> implements LinkedCirculateQueue<Tipo> {
	public static final int capacidade = 100;
	private int tamanho;
	private int frente;
	private int calda;
	private Object vetor[];

	public QueueVector() {
		this(capacidade);

	}

	public QueueVector(int capacidade) {
		tamanho = capacidade;
		vetor = new Object[tamanho];
	}

	@Override
	public int size() {

		return ((tamanho - frente + calda) % tamanho);
	}

	@Override
	public boolean isEmpty() {
		return (frente == calda);
	}

	@Override
	public Object front() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("Queue is empty.");
		return vetor[frente];
	}

	@Override
	public void enqueue(Tipo element) {
		if (size() == tamanho - 1)
			throw new QueueFullException("Queue overflow.");

		vetor[calda] = element;
		calda = (calda + 1) % tamanho;
	}

	@Override
	public Object dequeue() throws QueueEmptyException {
		
		Object elem;
		if (isEmpty())
			throw new QueueEmptyException("Queue is Empty.");
		elem = vetor[frente];
		vetor[frente] = null; // dereference Q[f] for garbage collection.
		frente = (frente + 1) % tamanho;
		return elem;
	}

	public void enqueue(int posicao, Tipo element) {
		if (size() == tamanho - 1)
			throw new QueueFullException("Queue overflow.");

		if (posicao < size() / 2) {
			for (int i = frente; i < posicao;) {

				vetor[((frente - 1 + tamanho) % tamanho)] = vetor[i];
				frente = (frente - 1 + tamanho) % tamanho;

			}
			vetor[posicao] = element;
		}

	}

	public void replace(int posicao, Tipo element) {
		vetor[posicao] = element;
	}

	public void imprimir() {
		int i = frente;
		while (i != calda) {
			System.out.println(vetor[i]);
			i = (i + 1) % tamanho;
		}
	}

}
