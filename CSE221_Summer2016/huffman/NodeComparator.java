import java.util.Comparator;

public class NodeComparator implements Comparator<Node>{

  public int compare(Node first, Node second){

    return ((Integer)first.charLength).compareTo((Integer)second.charLength);
  }
}
