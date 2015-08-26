package Pilha;

import java.util.LinkedList;
import java.util.Queue;

public class TesteSeila {
	public static void main(String[] args) {
		Queue<String> l = new LinkedList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		int k = (4-1+20)%20; //anti-horario

		System.out.println(k);

		System.out.println("lista: " + l);
		int x = l.size() / 2;

		pares(l, x);

	}
	
	// 1 5 9 11-
	private static void pares(Queue<String> l, int x) {
		if (l.size() % 2 == 1) {
		l.add(l.peek());	
		}
		System.out.println("lista:-" + l);
		for (int i = 0; i < x; i++) {
			l.add(l.poll());
			l.poll();
		}
		System.out.println("impares: " + l);
	}
}
