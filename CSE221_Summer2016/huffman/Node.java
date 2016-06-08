public class Node{

  public int charLength;
  public Object character;
  public Node left, right;
  public Node(int len, Object c, Node l, Node r){

    charLength = len;
    character = c;
    left = l;
    right = r;

  }

  //for debugging
  public String toString(){

    return "len: "+charLength+" char: "+character;
  }
}
