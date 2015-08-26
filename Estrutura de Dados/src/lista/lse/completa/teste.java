package lista.lse.completa;

public class teste {
	public static void main(String[] args) {
		EstruturaLSE lista = new EstruturaLSE();

		lista.inserir("a");
		lista.inserir("b");
		lista.inserir("c");
		lista.inserir("d");
		lista.inserir("e");
		lista.inserir("f");
		lista.imprimir();
		// lista.inserir(2, "o");
		// lista.imprimir();
		// System.out.println(lista.size());
		// System.out.println("Numero 0:" + lista.get(0));
		// lista.deletar(1);
		System.out.println("LISTA ORIGINAL");
		lista.imprimir();
		System.out.println("LISTA IMPARES");
		lista.imprimirImpares();
		// System.out.println(lista.contains("j"));
	}
}
