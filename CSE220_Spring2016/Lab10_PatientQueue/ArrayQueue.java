
package PatientQueue;

public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[20];
    }
    
//TO DO
    // The number of items in the queue
    public int size(){

     return size;
    } 
    
// Returns true if the queue is empty
    public boolean isEmpty(){

     if(size == 0){
      return true;
     }

     return false;
    }
    
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException{

     if(size == data.length){

      throw new QueueOverflowException();
     }

     if(size == 0){

      size++;
      front = 0;
      rear = 0;
     }else{

      size++;
      rear = (rear+1)%data.length;
     }

     data[rear] = o;
    } 
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{

     if(size == 0){

      throw new QueueUnderflowException();
     }

     Object keep = data[front];

     data[front] = null;
     
     if(front == rear){
         
         front = -1;
         rear = -1;
         
     }else{
         front = (front+1)%data.length;
     }    
     
     size--;

     
     return keep;
    }

// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{

     if(size == 0){

      throw new QueueUnderflowException();
     }

     return data[front];
    }

// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){

     String que = " ";

     int cursor = front;
     for(int i=0; i<size; i++){

      que+=data[cursor]+" ";

      cursor = (cursor+1)%data.length;
     }


     return "["+que+"]";
    }

// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){

     Object[] arr = new Object[size];

     int cursor = front;
     for(int i=0; i<size; i++){

      arr[i] = data[cursor];

      cursor = (cursor+1)%data.length;
     }

     return arr;
    }

// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){

     int cursor = front;
     for(int i=0; i<size; i++){

      if(data[cursor].equals(o)){

       return i;
      }

      cursor = (cursor+1)%data.length;
     }

     return -1;
    }
    
}