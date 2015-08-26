package lista.vetor.circular.completa;

import fila.arranjo.QueueFullException;

public class ListCirculate<Tipo> implements List<Tipo> {
	private static int capacity;
	private Object[] vetor;
	private int frente;
	private int calda;
	private int tamanho;

	public ListCirculate() {
		this(capacity);
	}

	public ListCirculate(int capacity) {
		tamanho = capacity;
		vetor = new Object[capacity];

	}

	@Override
	public Tipo elementAtRank(int posicao) {
		return null;
	}

	@Override
	public void removeAtRank(int posicao) {
		Tipo obj = (Tipo) vetor[posicao];

	}

	@Override
	public void insertAtRank(int posicao, Tipo element) {

	}

	@Override
	public void replaceAtRank(int posicao, Tipo element) {

	}

	@Override
	public int size() {
		return ((tamanho - frente + calda) % tamanho);
	}

	@Override
	public boolean isEmpty() {
		return frente==calda;
	}
	
	public void insert(Tipo element){
		if (size() == tamanho - 1)
			throw new QueueFullException("Queue overflow.");

		vetor[calda] = element;
		calda = (calda + 1) % tamanho;
	}

}
