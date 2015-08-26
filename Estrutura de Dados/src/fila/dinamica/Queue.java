package fila.dinamica;
public interface Queue {  
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
  public Object front() throws QueueEmptyException; 
 /** 
  * Insert an element at the rear of the queue.
  *
  * @param element new element to be inserted.
  */
  public void enqueue (Object element); 
 /** 
  * Remove the element at the front of the queue.
  *
  * @return element removed.
  * @exception QueueEmptyException if the queue is empty.
  */
  public Object dequeue() throws QueueEmptyException; 
}
