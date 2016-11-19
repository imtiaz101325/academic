import java.util.*;
import java.io.*;

public class Dijkstra {

  public static void dijkstra(Object[] list, Integer source){
    
    list[source].weight = 0;
    
    Comparator<Node> cp = new NodeComparator();
    PriorityQueue<Node> pq = new PriorityQueue<Node>(list.length-1, cp);
    
    for(int i=1; i<list.length; i++){
      pq.add(list[i]);
    }
    
    while(pq.size() != 0){
      Node current = pq.remove();
      
      Node n = list[current.vertex].next;
      while(n != null){
        int dist = n.weight + current.weight;
        if(dist < list[n.vertex].weight){
          list[n.vertex].weight = dist;
          list[n.vertex].prev = current.vertex;
        }
      }
    }

  }

  public static void main(String[] args){
    //path to file kept the in the same directory
    String fileName = "./file.txt";

    //file reader
    BufferedReader in = new BufferedReader(new FileReader(fileName));

    //Array of custom node objects
    Node[] arrayList = new Node[Integer.parseInt(in.readLine())+1];//size set to
                                                                //number of vertex
    //initializing array with the vertex names
    for(int i=1; i<arrayList.length; i++){

      arrayList[i] = new Node(i, 1000, null, null );
    }

    String line;
    while((line = in.readLine()) != null){

      String[] input = line.split(",");

      int source = Integer.parseInt(input[0]);

      int destination = Integer.parseInt(input[1]);
      int weight = Integer.parseInt(input[2]);

      arrayList[source-1].add(destination, weight);
    }

    dijkstra(arrayList, 1);
  }
}
