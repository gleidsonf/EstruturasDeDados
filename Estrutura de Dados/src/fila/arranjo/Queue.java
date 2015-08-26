package fila.arranjo;

public interface Queue<T> {  
 /** 
  * @return number of elements in the queue.
  */
  public int size();  
 /** 
  * @return true if the queue is empty, false otherwise.
  */
  public boolean isEmpty(); 
 /**
  * Inspect the element at the front of the queue.
  *
  * @return element at the front of the queue.
  * @exception QueueEmptyException if the queue is empty.
  */
  public T front() throws QueueEmptyException; 
 /** 
  * Insert an element at the rear of the queue.
  *
  * @param element new element to be inserted.
  */
  public void enqueue (T element); 
 /** 
  * Remove the element at the front of the queue.
  *
  * @return element removed.
  * @exception QueueEmptyException if the queue is empty.
  */
  public T dequeue() throws QueueEmptyException; 
}
