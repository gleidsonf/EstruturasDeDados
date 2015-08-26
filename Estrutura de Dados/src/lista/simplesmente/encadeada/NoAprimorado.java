package lista.simplesmente.encadeada;

public class NoAprimorado {
	private byte dados;
	private NoAprimorado prox;
	private int dadosInteiros;
	private String dadosString;
	private double dadosDouble;

	public NoAprimorado() {
	}

	public NoAprimorado(byte dados, NoAprimorado prox) {
		this.dados = dados;
		this.prox = prox;
	}

	public NoAprimorado(int dadosInteiros, NoAprimorado prox) {
		this.dadosInteiros = dadosInteiros;
		this.prox = prox;
	}

	public NoAprimorado(String dadosString, NoAprimorado prox) {
		this.dadosString = dadosString;
		this.prox = prox;
	}

	public NoAprimorado(double dadosDouble, NoAprimorado prox) {
		this.dadosDouble = dadosDouble;
		this.prox = prox;
	}

	public byte getDados() {
		return dados;
	}

	public void setDados(byte dados) {
		this.dados = dados;
	}

	public NoAprimorado getProx() {
		return prox;
	}

	public void setProx(NoAprimorado prox) {
		this.prox = prox;
	}

	public int getDadosInteiros() {
		return dadosInteiros;
	}

	public void setDadosInteiros(int dadosInteiros) {
		this.dadosInteiros = dadosInteiros;
	}

	public String getDadosString() {
		return dadosString;
	}

	public void setDadosString(String dadosString) {
		this.dadosString = dadosString;
	}

	public double getDadosDouble() {
		return dadosDouble;
	}

	public void setDadosDouble(double dadosDouble) {
		this.dadosDouble = dadosDouble;
	}

}
