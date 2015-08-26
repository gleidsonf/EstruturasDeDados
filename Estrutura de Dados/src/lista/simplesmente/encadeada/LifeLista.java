package lista.simplesmente.encadeada;

public class LifeLista {
	public static void main(String[] args) {

		String numero = "-8172636273267362732732565362";
		NoAprimorado no = null;
		for (int i = numero.length() - 1; i >= 0; i--) {	//Percorre a String decrescentemente
			
			if (i == 1) {
				no = new NoAprimorado(Byte.valueOf(numero.substring(0, 2)), no);
				/**
				*Quando o 'i' for a posição 1 da String numero, será adicionado os dois primeiros dígitos de uma vez.
				*O dígito referente ao sinal e ao número, já que no tipo byte eu só posso adicionar o sinal se seguido de um número.
				*Se não tiver sinal vai funcionar da mesma maneira e não altera a ordem do número.
				*/
				 
			break; //Sai do  if-else.
			}else{
				no = new NoAprimorado(Byte.valueOf(numero.charAt(i)+""), no); 
				/**
				 * Adiciona cada elemento da String numero pela posição.
				 * O (+"") depois do charAt(i) serve para concatenar com o char, 
				 * assim o que está dentro de valeuOf se torna String.
				 * Se deixar apenas numero.charAt(i) dará erro pois será entendido como tipo char e não como String
				 */
			}
		}

		NoAprimorado auxiliar = no;	
		/**
		 * Nó auxiliar para receber o nó principal.
		 * Na próxima condição esse nó auxiliar vai sendo destruído a medida que é impresso.
		 * Usando um auxiliar preserva-se o nó principal.
		 */

		while (auxiliar != null) {
			System.out.print(auxiliar.getDados()); 
			/**
			 * Usar 'print' para imprimir na mesma linha sequencialmente.
			 * auxiliar.getDados() vai imprimir apenas um dado referente ao nó atual.
			 */
			auxiliar = auxiliar.getProx();
			/**
			 * O nó auxiliar, assim com o nó principal é uma espécie de 'corda' com vários nós.
			 * O nó auxiliar atual já foi impresso, dessa forma para imprimir o próximo nó será
			 * preciso trocar o auxiliar atual pelo próximo. Daí a lista vai encolhendo até não 
			 * ter nenhum elemento e sair da condição 'while'
			 * 
			 */
		}
	}
}
