package lista.lse.completa;
public interface LSE {

	void inserir(Object dado);

	void deletar(int posicao);

	void inserir(int posicao, Object dado);

	int size();

	Object get(int posicao);
}

//"decorjex"