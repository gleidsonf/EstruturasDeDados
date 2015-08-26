package lista.vetor.circular.completa;

public interface List<Tipo> {
	Tipo elementAtRank(int posicao);

	void removeAtRank(int posicao);

	void insertAtRank(int posicao, Tipo element);

	void replaceAtRank(int posicao, Tipo element);

	int size();

	boolean isEmpty();
}
