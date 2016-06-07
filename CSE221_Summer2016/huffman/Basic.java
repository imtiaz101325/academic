
import java.util.*;
import java.io.*;
public class Basic{

  public static void main(Stirng[] args) throws Exception {

    PriorityQueue<Node> pQueue = new PriorityQueue<Node>(256);

    BufferedReader in = new BufferedReader(FileReader('./file.txt'));

    int[] tally = new int[256];

    //build huffman tree

    //read from file to PQ
    String line;
    while((line = in.readLine()) != null ){

      char[] charLine = line.toCharArray();

      //increament tally
      for(int i=0; i<charLine.length; i++){
        tally[charLine[i]]++;
      }
    }

    //add tally-ed node to pq
    for(int i=0; i<tally.length; i++){

      if(tally[i] > 0){
        pQueue.add(new Node(tally[i],(char) i, null, null));
      }
    }

    //build tree
    while(pQueue.size() > 1){

      Node first = pQueue.remove();
      Node second = pQueue.remove();
      pQueue.add(new Node(first.charLength+second.charLength,(char)0,first,second));
    }

    //final huffman Tree
    Node huffmanTree = pQueue.remove();

    //storing character code;
    String[] encode = new String[256];






  }
}
