package lista.simplesmente.encadeada;

import java.util.Stack;

public class ExPilha {

	public static void main(String[] args) {

		Stack<String> p = new Stack<String>();

		p.push("g");	//1º a entrar.
		p.push("l");
		p.push("e");
		p.push("i");
		p.push("d");
		p.push("s");
		p.push("o");
		p.push("n");	//Ultimo a entrar.

		imprimir(p);
		System.out.println("");
		inverterPilha(p);
		/*
		 * System.out.println("Pilha impressa normal"); imprimir(p);
		 * System.out.println(); imprimirInvertido(p); System.out.println();
		 * System.out.println("Pilha impressa invertida"); imprimir(p);
		 */
		// PilhaClonada(p);
	}

	private static void PilhaClonada(Stack<String> p) {
		Stack<String> aux = new Stack<String>();
		Stack<String> aux2 = new Stack<String>();

		while (!p.isEmpty()) {
			System.out.print(p.peek());
			aux.push(p.pop());
		}
		System.out.println("\n");
		while (!aux.isEmpty()) {
			aux2.push(p.push(aux.pop()));
			System.out.print(p.peek());

			System.out.println(aux2.peek());
		}

	}

	// TODO Inverter Pilha - Life 06/03
	private static void inverterPilha(Stack<String> p) {
		Stack<String> aux = new Stack<>();
		while (!p.isEmpty()) {
			aux.push(p.pop());
		}
		imprimir(aux);
	}

	private static void imprimirInvertido(Stack<String> p) {
		Stack<String> aux = new Stack<String>();
		Stack<String> aux2 = new Stack<String>();

		while (!p.isEmpty()) {
			aux.push(p.pop());

		}
		while (!aux.isEmpty()) {
			aux2.push(aux.pop());
		}
		while (!aux2.isEmpty()) {
			p.push(aux2.pop());

		}
		imprimir(aux);
	}

	private static void imprimir(Stack<String> p) {
		Stack<String> aux = new Stack<String>();
		while (!p.isEmpty()) {
			System.out.print(p.peek());
			aux.push(p.pop());
		}
		while (!aux.isEmpty()) {
			p.push(aux.pop());
		}

	}
}