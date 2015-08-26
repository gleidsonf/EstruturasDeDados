package arvore.deitel;

public class Tree<T extends Comparable<T>> {
	private TreeNode<T> root;

	// Construtor inicializa uma �rvore de inteiros vazia
	public Tree() {
		root = null;
	}

	// insere novo n� na �rvore de pesquisa bin�ria
	public void insertNode(T insertValue) {
		if (root == null)
			root = new TreeNode<T>(insertValue);
		else
			root.insert(insertValue);// chama o m�todo insert
	}// fim do insertNode
		// inicia percurso na pr�-ordem

	public void preorderTraversal() {
		preorderHelper(root);
	}

	// metodo recursirvo para realizar percurso na ordem
	private void preorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		System.out.printf("%s ", node.data); // gera sa�da de dados do n�
		preorderHelper(node.leftNode); // percorre sub�rvore esquerda
		preorderHelper(node.rightNode);// percorre sub�rvore direita
	}// fim do m�todo preorderHelper

	// inicia percurso na ordem
	public void inorderTraversal() {
		inorderHelper(root);
	}// fim do m�todo inorderTraversal
		// metodo recursirvo para realizar percurso na ordem

	private void inorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		inorderHelper(node.leftNode); // percorre sub�rvore esquerda
		System.out.printf("%s ", node.data); // gera sa�da de dados do n�
		inorderHelper(node.rightNode); // percorre sub�rvore direita
	} // fim do m�todo inorderHelper
		// inicia percurso na p�s-ordem

	public void postorderTraversal() {
		postorderHelper(root);
	}

	// metodo recursirvo para realizar percurso na p�s-ordem
	private void postorderHelper(TreeNode<T> node) {
		if (node == null)
			return;
		postorderHelper(node.leftNode); // percorre sub�rvore esquerda
		postorderHelper(node.rightNode); // percorre sub�rvore direita
		System.out.printf("%s ", node.data);
	}// fim do m�todo postorderHelper
}// fim da classe Tree