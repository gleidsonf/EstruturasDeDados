package fila.arranjo;
/*** Excecao */
public class QueueEmptyException extends RuntimeException {  
  public QueueEmptyException(String err) {
    super(err);
  }
}