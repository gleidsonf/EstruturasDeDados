package lista.simplesmente.encadeada;

public class No {
	private String dados;
	private No prox;

	public No() {

	}

	public No(String dados, No prox) {
		this.dados = dados;
		this.prox = prox;
	}

	public String getDados() {
		return dados;
	}

	public void setDados(String dados) {
		this.dados = dados;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	public void adicionar(int posicao, String elemento) {
	//	No inicio.setDados(this.getDados());
		while(this.getProx()!=null){
			
		}
		
}

}
