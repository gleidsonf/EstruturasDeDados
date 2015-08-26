package lista.lse.completa;
public class No {
	private Object dado;
	private No prox;

	public No() {
		this.dado = null;
		this.prox = null;
	}

	public No(Object dado, No prox) {
		super();
		this.dado = dado;
		this.prox = prox;
	}

	public Object getDado() {
		return dado;
	}

	public void setDado(Object dado) {
		this.dado = dado;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No no) {
		this.prox = no;
	}

}
