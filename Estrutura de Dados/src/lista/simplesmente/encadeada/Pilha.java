package lista.simplesmente.encadeada;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();

		pilha.push("A");
		pilha.push("B");
		pilha.push("C");
		pilha.push("D");
		
		pilha.push(pilha.pop());
		pilha.push(pilha.pop());
		pilha.push(pilha.pop());
		pilha.push(pilha.pop());

		while (!pilha.isEmpty()) {
			System.out.println(pilha.pop());
		}
	}
}
