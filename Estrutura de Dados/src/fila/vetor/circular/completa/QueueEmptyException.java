package fila.vetor.circular.completa;
/*** Excecao */
@SuppressWarnings("serial")
public class QueueEmptyException extends RuntimeException {  
  public QueueEmptyException(String err) {
    super(err);
  }
}