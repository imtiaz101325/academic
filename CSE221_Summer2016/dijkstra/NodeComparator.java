import java.util.*;

public class NodeComparator implements Comparator<Node>{
  
  public int compare(Node a, Node b){
    
    return a.weight - b.weight;
  }
}