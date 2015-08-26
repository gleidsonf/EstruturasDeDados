package fila.arranjo;

public class QueueVector<T> implements Queue<T> {
  public static final int CAPACITY = 100;
  private int N;
  private T Q[];
  private int f = 0; // frente da fila
  private int r = 0; // posição vazia após o fim da fila

  public QueueVector() {
    this(CAPACITY);
  }
  public QueueVector(int cap) {
    N = cap;
    Q = (T[])new Object[N];
  }

public int size() { 
    return ((N-f+r)%N);
}
 
 /*--------------------------------------------------*/
  public boolean isEmpty() {
    return (f==r);
  }
 /*--------------------------------------------------*/
   public T front() throws QueueEmptyException {
    if (isEmpty())
      throw new QueueEmptyException("Queue is empty.");
    return Q[f];
  }
 /*--------------------------------------------------*/
  public void enqueue (T element) throws QueueFullException {
    if (size() == N-1)
      throw new QueueFullException("Queue overflow.");
    
    Q[r] = element;
    r = (r+1)%N;    
  }
///////////
 public T dequeue() throws QueueEmptyException {
    T elem;
    if (isEmpty())
      throw new QueueEmptyException("Queue is Empty.");
    elem = Q[f];
    Q[f] = null; // dereference Q[f] for garbage collection.
    f = (f+1)%N;
    return elem;
  }
  
 public void Imprimir() {
 	int i = f;
 	while (i != r) {
 		System.out.println(Q[i]);
 		i = (i+1)%N;
 	}
 }
 
 public void ImprimirInvertido() {
 	int i = (N+r-1)%N;
 	
 	while (i != (N+f-1)%N) {
 		System.out.println(Q[i]);
 		i = (N+i-1)%N; 		
 	}
 	
 }
 
 public QueueVector<?> copia() {
	  	int tam = size(); 
	  	QueueVector<T> Aux = new QueueVector<T>(100);
	  	for (int i=0; i < tam; i++) {
	  		this.enqueue(this.front());
	  		Aux.enqueue(this.dequeue());
	   	}
	   return Aux; 	
	  }

 public QueueVector<?> copia(QueueVector<T> F) {
	  	int tam = F.size(); 
	  	QueueVector<T> Aux = new QueueVector<T>(100);
	  	for (int i=0; i < tam; i++) {
	  		F.enqueue(F.front());
	  		Aux.enqueue(F.dequeue());
	   	}
	   return Aux; 	
	  }
 
public static void main(String args[]) {
       QueueVector<Integer> F = new QueueVector<Integer>(10);
       F.enqueue(new Integer(1));
       F.enqueue(new Integer(10));
       F.enqueue(new Integer(100));
       F.enqueue(new Integer(1000));
       
       F.enqueue(new Integer(11));
       F.enqueue(new Integer(101));
       F.enqueue(new Integer(1001));
       F.enqueue(new Integer(10001));
       //F.Imprimir();
       
       QueueVector<?> C = F.copia();
       C.ImprimirInvertido();
       
       /*System.out.println(F.size());
       System.out.println(F.dequeue() + "  " + F.dequeue() + "  " + F.dequeue() + "  ");
       System.out.println(F.size());
       
       for(int i = 0; i < 8; i++)
          F.enqueue(new Integer(i));
       
       System.out.println("Elementos: " + F.size() + "\n");
       for(int i = 0; i < 9; i++)
          System.out.println(F.dequeue() + "  ");
          
       System.out.println("Tamanho: "+ F.size());*/
                     
  }
	  
}
