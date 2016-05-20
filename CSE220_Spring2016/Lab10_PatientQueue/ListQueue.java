
package PatientQueue;

public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    
//TO DO
// The number of items in the queue
    public int size(){

     return size;
    }
    
// Returns true if the queue is empty
    public boolean isEmpty(){

     if(size ==0){

      return true;
     }

     return false;
    }
    
// Adds the new item on the back of the queue, throwing the
// QueueOverflowException if the queue is at maximum capacity. It
// does not throw an exception for an "unbounded" queue, which 
// dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException{

     if(size == 0){

      front = new Node(o, null);
      rear = front;
      size++;

     }else{

      rear.next = new Node(o, null);
            rear = rear.next;
      size++;
     }
    }
    
// Removes the item in the front of the queue, throwing the 
// QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException{

     if(size == 0){

      throw new QueueUnderflowException();
     }

     Object keep = front.val;
     Node garbage = front;

     front = front.next;

     garbage.val = null;
     garbage.next = null;

     size--;


     return keep;
    }

// Peeks at the item in the front of the queue, throwing
// QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException{

     if(size == 0){

      throw new QueueUnderflowException();
     }

     return front.val;
    }

// Returns a textual representation of items in the queue, in the
// format "[ x y z ]", where x and z are items in the front and
// back of the queue respectively.
    public String toString(){

     String que = " ";

     Node n = front;
     for(;n.next != null; n=n.next){

      que+=n.val+" ";
     }
     que+=n.val+" ";

     return "["+que+"]";
    }

// Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray(){

     Object[] arr = new Object[size];

     Node n = front;
        int i=0;
     for(;n.next != null; n=n.next, i++){

      arr[i] = n.val;
     }
     arr[i]=n.val;

     return arr;

    }

// Searches for the given item in the queue, returning the
// offset from the front of the queue if item is found, or -1
// otherwise.
    public int search(Object o){

     Node n = front;
        int i=0;
     for(;n.next != null; n=n.next, i++){

      if(n.val.equals(o)){

       return i;
      }
     }
     if(n.val.equals(o)){

       return i;
     }

     return -1;
    }
}