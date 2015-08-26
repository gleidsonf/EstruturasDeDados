package lista.simplesmente.encadeada;

import java.util.Stack;

public class ExemploPilha {
	public static void main(String[] args) {
		Stack<String> p1 = new Stack<String>();
		p1.push("C");
		p1.push("D");
		p1.push("2");
		p1.push("3");
		p1.push(":");
		p1.push("0");
		p1.push("0");
		imprimirPilha(p1);
		inverterPilha(p1);
		imprimirPilha(p1);
		Stack<String> pclone = clonar(p1);
		imprimirPilha(pclone);
		System.out.println("tamanho: " + p1.size());
		System.out.println(analisadorExpressao("{[(())]}"));
	}

	// Fazer um analisador para verificar se uma expressão aritmética está
	// valida.
	// Exemplo {{{}} - ERRADO
	// Exemplo {[{}]} - CORRETO
	private static char[] analisadorExpressao(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	// Clonar uma pilha - ERRADO
	private static Stack<String> clonar(Stack<String> p1) {
		// TODO Auto-generated method stub
		Stack<String> paux = p1; // CORRIGIR
		return paux;
	}

	// Crie um método para inverter uma pilha
	private static void inverterPilha(Stack<String> p1) {
		Stack<String> paux1 = new Stack<String>();
		Stack<String> paux2 = new Stack<String>();
		while (!p1.isEmpty()) {
			paux1.push(p1.pop());
		}
		while (!paux1.isEmpty()) {
			paux2.push(paux1.pop());
		}
		while (!paux2.isEmpty()) {
			p1.push(paux2.pop());
		}
	}

	private static void imprimirPilha(Stack<String> p1) {
		Stack<String> aux = new Stack<String>();
		while (!p1.isEmpty()) {
			System.out.println(p1.peek());
			aux.push(p1.pop());
		}
		while (!aux.isEmpty()) {
			p1.push(aux.pop());
		}
	}
}
