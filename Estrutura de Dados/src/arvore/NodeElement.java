package arvore;

import java.util.ArrayList;
import java.util.List;

public class NodeElement {
	private String element;
	private List<NodeElement> filhos;

	public NodeElement(String element) {
		this.element = element;
		this.filhos = null;
	}

	public NodeElement adicionarFilho(String element) {
		if (this.filhos == null) {
			this.filhos = new ArrayList<NodeElement>();
		}
		NodeElement filho = new NodeElement(element);
		this.filhos.add(filho);
		return filho;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public List<NodeElement> getFilhos() {
		if (filhos == null)
			return new ArrayList<NodeElement>();
		return filhos;
	}

	// public void setFilhos(List<NodeElement> filhos) {
	// this.filhos = filhos;
	// }

}