package fila.vetor.circular.completa;

/*** Excecao */
@SuppressWarnings("serial")
public class QueueFullException extends RuntimeException {  
  public QueueFullException(String err) {
    super(err);
  }
}