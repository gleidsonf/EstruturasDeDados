package arvore.deitel;

import java.util.Random;

public class TreeTest {
	public static void main(String[] args) {
		Tree<Integer> tree = new Tree<>();
		int value;
		Random randomNumber = new Random();
		System.out.println("Insert the following values");
		// insere 10 inteiros aleatórios de 0-99 na árvore
		for (int i = 1; i <= 10; i++) {
			value = i*randomNumber.nextInt(25);
			System.out.printf("%d ", i);
			tree.insertNode(i);
		}// for final
		System.out.println("\n\nPreorder Traversal");
		tree.preorderTraversal(); // realiza percurso na pré-ordem da árvore
		System.out.println("\n\nInorder Traversal");
		tree.inorderTraversal(); // realiza percurso na ordem da árvore
		System.out.println("\n\nPostorder Traversal");
		tree.postorderTraversal(); // realiza percurso na pós-ordem da árvore
		System.out.println();
	}
}