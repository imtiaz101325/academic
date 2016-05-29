//Node class
public class Node{

  Object vertex;
  Node next;

  public Node(Object v, Node n){

    vertex = v;
    next = n;
  }

  public void add(Object element){
    Node list = this;
    //edge case: manually set first node after head
    if(list.next == null){
      list.next = new Node(element, null);
    }else{
      Node n = list;
      for(;n.next != null; n = n.next);//find last node
      n.next = new Node(element, null);
    }
  }
}
