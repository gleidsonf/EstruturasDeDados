package fila.vetor.circular.completa;

public class Test {
	public static void main(String[] args) {
		QueueVector<String> q1 = new QueueVector<>();
		q1.enqueue("A");
		q1.enqueue("B");
		q1.enqueue("C");
		q1.enqueue("D");
		q1.enqueue("E");
		q1.enqueue("F");
		//q1.enqueue(1, "X");
		q1.imprimir();
//		int x = q1.size();
//		for (int i = 0; i < x; i++) {
//			System.out.println(q1.front());
//			System.out.println(q1.dequeue());
//		}
		System.out.println("-------------------------");
		
		QueueVectorAH<String> q2 = new QueueVectorAH<>();
		q2.enqueue("A");
		q2.enqueue("B");
		q2.enqueue("C");
		q2.enqueue("D");
		q2.enqueue("E");
		q2.enqueue("F");
		q2.imprimir();
		
		
		//q2.imprimir();
//		x = q2.size();
//		for (int i = 0; i < x; i++) {
//			System.out.println(q2.front());
//			System.out.println(q2.dequeue());
//		}
		
	}
}
