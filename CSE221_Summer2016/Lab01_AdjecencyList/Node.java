public class Node{

  Object vertex;
  Node next;

  public Node(){

    vertex = null;
    next = null;
  }

  public Node(Object v, Node n){

    vertex = v;
    next = n;
  }
}
