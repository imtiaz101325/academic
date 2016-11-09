//Node class
import java.util.*;

public class Node implements Comparator<Node>{

  private Object vertex;
  private Integer weight;
  private Integer cost;
  private Node prev;
  private Node next;

  public Node(Object v, Integer w, Integer c, Node p, Node n){

    vertex = v;
    weight = w;
    cost = c;
    prev = p;
    next = n;
  }

  public void add(Object e, Integer w){
    Node list = this;
    //edge case: manually set first node after head
    if(list.next == null){
      list.next = new Node(e, w, Integer.MAX_VALUE, null, null);
    }else{
      Node n = list;
      for(;n.next != null; n = n.next);//find last node
      n.next = new Node(e, w, Integer.MAX_VALUE, null, null);
    }
  }

  public void setPrev(Node p){
    prev = p;
  }

  public Node getPrev(){
    return prev;
  }

  public void setCost(Integer c){
    cost = c;
  }

  public Integer getCost(){
    return cost;
  }

  public Integer getWeight(){
    return weight;
  }

   public Node compareTo(Node n) {
      return (this.cost).compareTo(n.cost);
   }

  public String toString(){
    return vertex;
  }
}
