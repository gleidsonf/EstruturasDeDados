package arvore.deitel;

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

	// Construtor inicializa uma árvore de inteiros vazia
	public Tree() {
		root = null;
	}

	// insere novo nó na árvore de pesquisa binária
	public void insertNode(T insertValue) {
		if (root == null)
			root = new TreeNode<T>(insertValue);
		else
			root.insert(insertValue);// chama o método insert
	}// fim do insertNode
		// inicia percurso na pré-ordem

	public void preorderTraversal() {
		preorderHelper(root);
	}

	// metodo recursirvo para realizar percurso na ordem
	private void preorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		System.out.printf("%s ", node.data); // gera saída de dados do nó
		preorderHelper(node.leftNode); // percorre subárvore esquerda
		preorderHelper(node.rightNode);// percorre subárvore direita
	}// fim do método preorderHelper

	// inicia percurso na ordem
	public void inorderTraversal() {
		inorderHelper(root);
	}// fim do método inorderTraversal
		// metodo recursirvo para realizar percurso na ordem

	private void inorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		inorderHelper(node.leftNode); // percorre subárvore esquerda
		System.out.printf("%s ", node.data); // gera saída de dados do nó
		inorderHelper(node.rightNode); // percorre subárvore direita
	} // fim do método inorderHelper
		// inicia percurso na pós-ordem

	public void postorderTraversal() {
		postorderHelper(root);
	}

	// metodo recursirvo para realizar percurso na pós-ordem
	private void postorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		postorderHelper(node.leftNode); // percorre subárvore esquerda
		postorderHelper(node.rightNode); // percorre subárvore direita
		System.out.printf("%s ", node.data);
	}// fim do método postorderHelper
}// fim da classe Tree