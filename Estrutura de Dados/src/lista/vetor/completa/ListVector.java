package lista.vetor.completa;

public class ListVector<Tipo> implements Vector<Tipo> {
	private Object[] vetor;
	private int size;

	public ListVector() {
		vetor = new Object[20];
		size = 0;
	}

	public ListVector(int tamanho) {
		vetor = new Object[tamanho];
		size = 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Tipo elementAtRank(int posicao) {
		return (Tipo) vetor[posicao];
	}

	@Override
	public void removeAtRank(int posicao) {
		if (posicao > size) {
			throw new ListVectorFullException("List Full!!");
		}
		for (int i = posicao; i < vetor.length - 1; i++) {
			vetor[i] = vetor[i + 1];
		}
		size--;
	}

	@Override
	public void insertAtRank(int posicao, Tipo element) {
		vetor[posicao] = element;
		size++;
	}

	@Override
	public void replaceAtRank(int posicao, Tipo element) {
		vetor[posicao] = element;
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
		int i = 0;
		while (vetor[i] != null) {
			System.out.println(vetor[i]);
			i++;
		}
	}

	public void insert(Tipo element) {
		vetor[size] = element;
		size++;
	}

	public Object[] getVetor() {
		return vetor;
	}

	public void setVetor(Object[] vetor) {
		this.vetor = vetor;
	}

}
