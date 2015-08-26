package arvore;

public class ArvoreNAria {
	
	public void PreOrdem(NodeElement no) {
		System.out.print(no.getElement() + " "); //visita no
		
		for (NodeElement filho : no.getFilhos()) {
			PreOrdem(filho);
		}
		
		//for(int i = 0; i < no.getFilhos().size(); i++) {
		//    PreOrdem(no.getFilhos().get(i));
		// }
	}
	
	public void PosOrdem(NodeElement no) {
		for (NodeElement filho : no.getFilhos()) {
			PosOrdem(filho);
		}
		System.out.print(no.getElement() + " "); //visita no
	}


}