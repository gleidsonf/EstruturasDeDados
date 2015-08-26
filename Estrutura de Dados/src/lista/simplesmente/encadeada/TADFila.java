package lista.simplesmente.encadeada;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//implementar um método para imprimir a fila ao contrário usando 1 Pilha - ok
//implementar um método para imprimir a fila ao contrário usando apenas fila - ok
//implementar um método para inverter uma fila usando 1 fila auxiliar - 
//implementar um método para inverter uma fila usando apenas Fila (LIFE) -
import java.util.Stack;

import javax.lang.model.element.Element;

public class TADFila {
	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<String>();
		q1.add("N");
		q1.add("E");
		q1.add("Y");
		q1.add("M");
		q1.add("A");
		q1.add("R");
		imprimirFila(q1);
		Queue<String> q2 = clonarFila(q1);
		imprimirFila(inverterFila(q1));
		System.out.println("\n");
		imprimirFila(inverterFila3(inverterFila(q1)));
		imprimirFila(inverterFila(q1));
	}

	private static Queue<String> clonarFila(Queue<String> q1) {
		Queue<String> qclone = new LinkedList<String>();
		for (int i = 0; i < q1.size(); i++) {
			qclone.add(q1.peek());
			q1.add(q1.poll());
		}
		return qclone;
	}

	private static void imprimirFila(Queue<String> q1) {
		for (int i = 0; i < q1.size(); i++) {
			System.out.print(q1.peek() + " ");
			q1.add(q1.poll());
		}
		System.out.println("\n");
	}

	private static void imprimiraoContratio2(Queue<String> q1) {
		for (int j = 0; j < q1.size(); j++) {
			for (int i = 0; i < q1.size() - 1; i++) {
				q1.add(q1.poll());
			}
			System.out.println(q1.peek());
		}
	}

	// v1
	private static void imprimiraoContrario(Queue<String> q1) {
		Stack<String> s1 = new Stack<String>();
		for (int i = 0; i < q1.size(); i++) {
			s1.push(q1.peek());
			q1.add(q1.poll());
		}
		while (!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
	}

	// e d c b a
	// d c b a
	// e d c b a

	private static Queue<String> inverterFila2(Queue<String> q1) {

		Collections.reverse((List<?>) q1);
		int tamanho = q1.size();
		for (int i = 0; i < q1.size(); i++) {
			for (int j = 0; j < q1.size() - 1; j++) {
				q1.add(q1.poll());
			}
			q1.add(q1.poll());
		}

		return q1;
	}

	private static Queue<String> inverterFila3(Queue<String> q1) {
		int contador = 1;
		String s ="";
		for (int i = 0; i < q1.size(); i++) {
			for (int j = 0; j < q1.size() - 1; j++) {

				q1.add(q1.poll());

			}
			contador++;
			q1.add(q1.poll());
			s = q1.poll();
		}

		q1.add(s);
		return q1;
	}
	//TODO FEITO - INVERTER FILA USANDO UM AUXILIAR
	private static Queue<String> inverterFila(Queue<String> q1) {
		Queue<String> q2 = new LinkedList<String>();

		for (int i = 0; i < q1.size(); i++) {
			for (int j = 0; j < q1.size() - 1; j++) {
				q1.add(q1.poll());
			}
			q2.add(q1.peek());
		}
		return q2;

	}
}
