public class Node {
    
    public int elem;
    public Node next;
    
    public Node(){
        
        this(-1, null);
    }
    
    public Node(int e, Node n){
        
        elem = e;
        next = n;
    }
    
    public Node(int e){
        
        elem = e;
        next = null;
    }
    
    public Node(Node n){
        
        elem = -1;
        next = n;
    }
    
}
