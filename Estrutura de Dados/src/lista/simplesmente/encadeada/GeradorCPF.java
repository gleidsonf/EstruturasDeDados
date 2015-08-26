package lista.simplesmente.encadeada;


public class GeradorCPF {

	public static void main(String[] args) {
		double numero;

		for (int i = 0; i < 20; i++) {
			numero = Math.random() * 1000;
			numero = Math.round(numero);
			System.out.println(numero);

		}
	}

}
