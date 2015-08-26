package Pilha;

import java.util.LinkedList;
import java.util.Queue;

public class Prova {
	public static void main(String[] args) {

		Queue<Integer> k = new LinkedList<>();
		k.add(1);
		k.add(3);
		k.add(5);
		k.add(7);
		k.add(9);
		k.add(11);
		System.out.println(k);
		impares(k);
		System.out.println(k);
	}

	public static void impares(Queue<Integer> p) {
		int x = p.size()/2;
		for (int i = 0; i < x; i++) {
			p.poll();
			p.add(p.poll());

		}
		if ((x - 1) % 2 == 0) {
			p.poll();
			p.add(p.poll());
		} else {
			p.poll();
		}

	}
}
