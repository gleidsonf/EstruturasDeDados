package lista.vetor.completa;

public class Test {
	public static void main(String[] args) {
		ListVector<String> lista = new ListVector<>();
		lista.insertAtRank(0, "A");
		lista.insertAtRank(1, "B");
		lista.insertAtRank(2, "C");
		lista.insertAtRank(3, "D");
		lista.insertAtRank(4, "E");
		lista.insertAtRank(5, "F");
		lista.imprimir();
		System.out.println("--------");
		lista.replaceAtRank(2, "H");
		lista.imprimir();
		System.out.println("--------");
		lista.removeAtRank(2);
		lista.imprimir();
		
	}

}
