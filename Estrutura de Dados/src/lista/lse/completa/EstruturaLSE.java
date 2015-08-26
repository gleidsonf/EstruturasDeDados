package lista.lse.completa;

class EstruturaLSE implements LSE {
	private No no = null;
	private int size;

	@Override
	public void inserir(Object dado) {
		// TODO Auto-generated method stub
		this.no = new No(dado, this.no);
		this.size++;
	}

	@Override
	public void deletar(int posicao) {
		No aux = this.no;
		int count = 1;

		while (aux != null) {
			if (posicao == 0) {
				this.no = this.no.getProx();
				break;
			}
			if (posicao == count) {
				aux.setProx(aux.getProx().getProx());
			}

			aux = aux.getProx();
			count++;
		}
		this.size--;

	}

	@Override
	public void inserir(int posicao, Object dado) {
		No aux = this.no;
		No novo = new No(dado, null);
		for (int i = 0; i < posicao; i++) {
			aux = aux.getProx();
		}
		aux.setProx(novo);
		novo.setProx(aux.getProx());

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public Object get(int posicao) {
		No aux = this.no;
		for (int i = 0; i < posicao; i++) {
			aux = aux.getProx();
		}
		return aux.getDado();
	}

	public void imprimir() {
		No aux = this.no;
		while (aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
		System.out.println("\n");
	}

	public boolean contains(Object dado) {
		No aux = this.no;
		while (aux != null) {
			if (dado == aux.getDado()) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;
	}

	public void imprimirImpares() {
		No aux = no;
			for (int i = 0; i < size; i++) {
				if (i % 2 == 1) {
					System.out.println(aux.getDado());
				}
				aux = aux.getProx();

			}


	}
}
