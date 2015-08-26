package lista.simplesmente.encadeada;

public class CopyOfListaLSE {

	private final No no=null;

	public static void main(String[] args) {

		String s = "Fortaleza2x2";

		No inicio = null;
		// Criação da lista ao contrário
		for (int i = s.length() - 1; i >= 0; i--) {
			inicio = new No(s.charAt(i) + "", inicio);
		}
		CopyOfListaLSE l = new CopyOfListaLSE();
		l.inserir("Gleidso");
		System.out.println(l.no.getDados());
//
//		imprimir(inicio);
//		inserir(2, inicio, "A");
//		imprimir(inicio);
//		System.out.println("fim do life");
//		System.out.println("\nImprimir ao contrário\n");
//		imprimirAoContrario(inicio);
//		System.out.println("\nImprimir");
//		imprimir(inicio);
//		System.out.println("\nImprimir Penultimo\n");
//		imprimirPenUltimo(inicio);
//		System.out.println("\nContar\n");
//		System.out.println(contar(inicio));
//		System.out.println("\nRetorna Ultimo\n");
//		retornaUltimo(inicio);
//		System.out.println("\nImprimir Contrario - Maikol\n");
//		imprimirContrario(inicio);
//		System.out.println("\nTransformar LSE em Circular");
//		transformarLSECircular(inicio);
	}

	// Imprimir a lista ao contrário

	private void imprimirAoContrario(No no) {
		No aux = no;
		No aux1 = null;
		/**
		 * Adiciona no nó aux1 'descosta' o nó principal. Ex: Para adicionar
		 * FORTALEZA, tem que começar do A ao F, assim será adicionado na
		 * ordem: FORTALEZA Para imprimir ao contrário, basta adicionar em um
		 * novo nó todas as palavras, sem começar da ultima para a primeira,
		 * assim adicionará ao contrário.
		 */
		while (aux != null) {
			aux1 = new No(aux.getDados(), aux1);
			aux = aux.getProx();
		}
		/**
		 * Zerar o aux, já que ele é somente um auxiliar, para receber e
		 * imprimir a nova lista criada em ordem inversa(aux1);
		 */
		// aux = null;
		aux = aux1;
		while (aux != null) {
			System.out.print(aux.getDados());
			aux = aux.getProx();
		}

	}

	private int contar(No inicio) {
		int cont = 0;
		No aux = inicio;
		while (aux != null) {
			aux = aux.getProx();
			cont++;
		}
		return cont;

	}

	// não feito por mim.
	public String contrario(No no) {
		String stringNo = "";
		if (no.getProx() != null) {
			stringNo = this.contrario(no.getProx());
		}
		return stringNo + no.getDados();
	}

	public void inserir(String dado){
		No novo = new No();
		novo.setDados(dado);
		No aux = new No();
		novo.setProx(this.no);
		while(this.no!=null){
			if(this.no.getProx() == null){
				aux = this.no.getProx();
				this.no.setProx(null);
			}
		}
	}
	public void inserir(int posicao, No inicio, String dado) {
		No novo = new No();
		novo.setDados(dado);
		No aux = new No();
		novo.setProx(inicio);
		for (int i = 0; i <= posicao; i++) {

			while (inicio != null) {

				if (inicio.getProx() == null) {
					aux = inicio.getProx();
					inicio.setProx(null);

				}
			}
		}
	}

	// 1) Clonar uma LSE
	// 2) Transformar uma LSE Não Circular em uma LSE Circular
	// 3) Eliminar todos os elementos *pares* de uma LSE
	// 4) Inserir um elemento no final da Lista
	// 5) Inserir um elemento no *meio* da lista (supondo que a lista tem numero
	// de elementos pares)
	// 6) Eliminar o elemento do *meio* da lista (supondo que a lista tem numero
	// de elementos ímpares)
	// 7) Inserir um elemento na posição *pos* da lista (passando por
	// parâmetro)
	// 8) Remover um elemento na posição *pos* da lista (passando por
	// parâmetro)

	// Questao2) Transformar uma LSE Não Circular em uma LSE Circular
	private void transformarLSECircular(No inicio) {
		No aux = inicio;
		// ultima posicao
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(inicio);
	}

	// Imprimir a lista ao contrário
	private void imprimirContrario(No inicio) {
		// TODO Auto-generated method stub
		int qtd = contar(inicio);

		// criar um novo laço for

		No aux = inicio;
		for (int j = 1; j < qtd; j++) {
			for (int i = 1; i < qtd - 1; i++) {
				aux = aux.getProx();
			}
			System.out.println(aux.getDados());
		}
	}

	// TODO LIFE*
	private void inserirPos(int posicao, No inicio) {
		No aux = inicio;
		for (int i = 0; i <= posicao; i++) {
			aux = aux.getProx();

		}

	}

	// Inverter a Lista
	private void inverter(No inicio) {
		// TODO Auto-generated method stub

	}

	private void inserirFinal(String dado) {
		No no = new No();
		no.setDados(dado);
		for (int i = 0; i < contar(no); i++) {

		}

	}

	// imprimir o ultimo elemento da lista
	private void imprimirPenUltimo(No inicio) {
		No aux = inicio;
		while (aux.getProx().getProx() != null) {
			aux = aux.getProx();
		}
		System.out.print(aux.getDados() + " ");
	}

	private static void imprimir(No inicio) {
		No aux = inicio;
		while (aux != null) {
			System.out.print(aux.getDados());
			aux = aux.getProx();
		}
	}

	private static String retornaUltimo(No inicio) {

		No aux = inicio;
		while (aux.getProx() != null) {

			System.out.println(aux.getDados());
			break;
		}
		return aux.getDados();
		// System.out.print(aux.getDados() + " ");
	}

	// 7) Inserir um elemento na posição *pos* da lista (passando por
	// parâmetro)
	public static void adicionar(int posicao, String elemento, No inicio) {

		No aux = inicio;
	}

	private static void deletar(int posicao, No inicio) {

	}
} // fim da classe