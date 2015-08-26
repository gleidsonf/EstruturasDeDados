package lista.vetor.circular.completa;

@SuppressWarnings("serial")
public class QueueFullException extends RuntimeException {
	public QueueFullException(String erro) {
		System.out.println(erro);
	}

}
