package exercicios;

import java.util.Deque;
import java.util.LinkedList;

public class ExDeque {

	public static void main(String[] args) {

		Deque<String> d1 = new LinkedList<String>();

		d1.addFirst("E");
		d1.addLast("R");
		d1.addLast("A");
		d1.addLast("Y");
		d1.addFirst("N");
		d1.addFirst("N");
		d1.addFirst("E");
		d1.addLast("E");
		// d1.removeLast();
		System.out.println(d1);
		eliminarRepetidos(d1);
		// Deque<String> dC = clonar(d1);
		// inverter(d1);
		// eliminarRepetidos(d1);

		System.out.println(d1);
		// System.out.println(dC);
	}

	// Inverter (TAD-Deque): Com e sem Deque auxiliar
	// Eliminar Repetidos (TAD-Deque): Com e sem Deque auxiliar

	private static void eliminarRepetidos(Deque<String> d1) {
		String elemento = "";
		int tamanho = d1.size();
		// while (elemento != d1.getLast()) {
		for (int i = 0; i < d1.size(); i++) {
			elemento = d1.getFirst();

			if (d1.getFirst().equals(elemento)) {
				d1.remove();
			}
			d1.addLast(elemento);
		}

	}

	private static void inverter(Deque<String> d1) {
		// TODO Auto-generated method stub
	}

	private static Deque<String> clonar(Deque<String> d1) {

		Deque<String> clone = new LinkedList<String>();

		for (int i = 0; i < d1.size(); i++) {
			clone.addLast(d1.getFirst());
			d1.addLast(d1.removeFirst());
		}
		return clone;
	}

}
