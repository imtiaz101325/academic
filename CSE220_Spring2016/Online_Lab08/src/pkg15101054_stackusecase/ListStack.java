
package pkg15101054_stackusecase;

public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    
    // The number of items on the stack
    public int size(){
        
        return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        
        if(size != 0){
            
            return false;
        }
        
        return true;
    }
   
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e){
        
        if(size == 0){
            
            size++;
            top = new Node(e, null);
        }else{
            size++;
            Node postNode = new Node(e, null);
            postNode.next = top;
            top = postNode;
        }
    }
    
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        
        if(size == 0){
            
            throw new StackUnderflowException();
        }
        
        Object keep = top.val;
        size--;
        Node garbage = top;
        top = top.next;
        
        garbage.val = null;
        garbage.next = null;
        
        return keep;
    }
    
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
    
        if(size == 0){
            
            throw new StackUnderflowException();
        }
        
        return top.val;
    }
    
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
    
        String s = "";
        
        Node n=top;
        for(; n.next!=null; n=n.next){
            
            s+=" "+n.val;
        }
        s+=" "+n.val;
        
        return "["+s+" ]";
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        
        Object[] re = new Object[size];
        
        int j=0;
        for(Node n=top; n.next!=null; n=n.next,j++){
            
            re[j] = n.val;
        }
        
        return re;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        
        boolean status = false;
        
        int j=0;
        for(Node n=top; n.next!=null; n=n.next,j++){
            
            if(n.val.equals(e)){
                
                status = true;
                break;
            }
        }
        
        return j;
    }

}