package fila.lde.completa;

public class Test {
	public static void main(String[] args) {
		LinkedQueueCirculate<String> q = new LinkedQueueCirculate<>();
		System.out.println(q.isEmpty());
		q.insertFirst("A");
		q.insertLast("B");
		q.insertLast("C");
		q.insertLast("D");
		q.imprimir();
		System.out.println("posicao 4: " + q.get(4));
		System.out.println("FIRST " + q.first());
		System.out.println("SIZE " + q.size());
		System.out.println("REMOVE LAST " + q.removeLast());
		q.imprimir();
		System.out.println("REMOVE FIRST " + q.removeFirst());
		q.imprimir();
		System.out.println(q.size());
		System.out.println("contains " + q.contains("c"));
		System.out.println("EMPTY " + q.isEmpty());
	}
}
