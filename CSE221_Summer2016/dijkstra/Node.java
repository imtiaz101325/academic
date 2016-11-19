//Node class
import java.util.*;

public class Node{

  private Integer vertex;
  private Integer weight;
  private int prev;
  private Node next;

  public Node(Integer v, Integer w, int p, Node n){

    vertex = v;
    weight = w;
    prev = p;
    next = n;
  }

  public void add(Object e, Integer w){
    Node list = this;
    //edge case: manually set first node after head
    if(list.next == null){
      list.next = new Node(e, w, null, null);
    }else{
      Node n = list;
      for(;n.next != null; n = n.next);//find last node
      n.next = new Node(e, w, -1, null);
    }
  }
}
