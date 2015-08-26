package arvore.deitel;

public class TreeNode<T extends Comparable<T>> {
	// membros de acesso de pacote
	TreeNode<T> leftNode; // n� esquerdo
	T data; // valor do n�
	TreeNode<T> rightNode; // n� direito

	public TreeNode(T nodeData) {
		data = nodeData;
		leftNode = rightNode = null; // o n� n�o tem nenhum filho
	} // fim do construtor TreeNode
		// locali��o inser��o e insere novo n�; ignora valores duplicados

	public void insert(T insertValue) {
		// insere na sub�rvore a esquerda
		if (insertValue.compareTo(data) > 0) {
			// insere novo TreeNode
			if (leftNode == null)
				leftNode = new TreeNode<T>(insertValue);
			else
				// continua percorrendo a sub�rvore a esquerda recursivamente
				leftNode.insert(insertValue);
		}// fim do if
			// insere na sub�rvore a direita
		else if (insertValue.compareTo(data) > 0) {
			// insere novo TreeNode
			if (rightNode == null)
				rightNode = new TreeNode<T>(insertValue);
			else
				// continua percorrendo a sub�rvore a direita recursivamente
				rightNode.insert(insertValue);
		}// fim do else if
	}// fim do m�todo insert
}// fim da classe TreeNode