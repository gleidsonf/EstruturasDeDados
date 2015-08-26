package arvore.deitel;

public class TreeNode<T extends Comparable<T>> {
	// membros de acesso de pacote
	TreeNode<T> leftNode; // nó esquerdo
	T data; // valor do nó
	TreeNode<T> rightNode; // nó direito

	public TreeNode(T nodeData) {
		data = nodeData;
		leftNode = rightNode = null; // o nó não tem nenhum filho
	} // fim do construtor TreeNode
		// localição inserção e insere novo nó; ignora valores duplicados

	public void insert(T insertValue) {
		// insere na subárvore a esquerda
		if (insertValue.compareTo(data) > 0) {
			// insere novo TreeNode
			if (leftNode == null)
				leftNode = new TreeNode<T>(insertValue);
			else
				// continua percorrendo a subárvore a esquerda recursivamente
				leftNode.insert(insertValue);
		}// fim do if
			// insere na subárvore a direita
		else if (insertValue.compareTo(data) > 0) {
			// insere novo TreeNode
			if (rightNode == null)
				rightNode = new TreeNode<T>(insertValue);
			else
				// continua percorrendo a subárvore a direita recursivamente
				rightNode.insert(insertValue);
		}// fim do else if
	}// fim do método insert
}// fim da classe TreeNode