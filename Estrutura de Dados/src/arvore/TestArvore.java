package arvore;

public class TestArvore {

	public static void main(String[] args) {
		NodeElement raiz = new NodeElement("A");

		NodeElement NoB = raiz.adicionarFilho("B");
		NodeElement NoC = raiz.adicionarFilho("C");
		NodeElement NoD = raiz.adicionarFilho("D");

		NodeElement NoE = NoC.adicionarFilho("E");
		NodeElement NoF = NoC.adicionarFilho("F");
		NodeElement NoG = NoC.adicionarFilho("G");
		NodeElement NoH = NoC.adicionarFilho("H");

		NodeElement NoI = NoG.adicionarFilho("I");
		NodeElement NoJ = NoG.adicionarFilho("J");
		NodeElement NoL = NoG.adicionarFilho("L");

		ArvoreNAria t1 = new ArvoreNAria();
		System.out.println("PreOrdem: ");
		t1.PreOrdem(raiz);
		System.out.println("\n\nPosOrdem: ");
		t1.PosOrdem(raiz);
	}

}
