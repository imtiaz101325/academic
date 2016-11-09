import java.util.*;
import java.io.*;

public class Dijkstra {

  public void dijkstra(Object[] list, Integer source){
    list[source].setCost(0);


  }

  public static void main(String[] args){
    //path to file kept the in the same directory
    String fileName = "./file.txt";

    //file reader
    BufferedReader in = new BufferedReader(new FileReader(fileName));

    //Array of custom node objects
    Node[] arrayList = new Node[Integer.parseInt(in.readLine())];//size set to
                                                                //number of vertex
    //initializing array with the vertex names
    for(int i=0; i<arrayList.length; i++){

      arrayList[i] = new Node(i+1, -1, null);
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
