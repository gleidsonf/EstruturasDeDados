package lista.lde.completa1;

public class Test {

	public static void main(String[] args) {
		EstruturaLDE<String> l = new EstruturaLDE<>();
		l.insertFirst("B");
		l.insertFirst("A");
		l.insertLast("C");
		l.insertLast("D");
//		System.out.println("Size: " +l.size());
//		System.out.println("Is empty? " + l.isEmpty());
//		System.out.println("Primeiro: " + l.first());
//		System.out.println("Ulitmo: " + l.last());
//		l.imprimir();
//		l.removeFirst();
//		System.out.print("\n\n");
		l.imprimir();
//		l.removeLast();
//		System.out.print("\n\n");
//		l.imprimir();

	}

}
