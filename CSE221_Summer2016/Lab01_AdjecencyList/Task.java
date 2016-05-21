
import java.util.*;
import java.io.*;

public class Task{

  public static void main(String[] args) throws Exception {
    String fileName = "/home/excalliburbd/code/academic/CSE221_Summer2016/Lab01_AdjecencyList/flie.txt";

    BufferedReader in = new BufferedReader(new FileReader(fileName));

    Node[] arrayList = new Node[Integer.parseInt(in.readLine())];

    for(int i=0; i<arrayList.length; i++){

      arrayList[i] = new Node(i+1, null);
    }

    String line;
    while((line = in.readLine()) != null){

      String[] input = line.split(",");

      int source = Integer.parseInt(input[0]);
      int destination = Integer.parseInt(input[1]);

      if(source == -1 || destination == -1){
        break;
      }

      if(arrayList[source-1].next == null){
        arrayList[source-1].next = new Node(destination, null);
      }else{
        Node n = arrayList[source-1];
        for(;n.next != null; n = n.next);
        n.next = new Node(destination, null);
      }
    }

    for(int i=0; i<arrayList.length; i++){

      System.out.print("|"+arrayList[i].vertex+"| -> ");
      if(arrayList[i].next == null){
        System.out.println("--|");
      }else{
        Node n = arrayList[i].next;
        for(;n.next != null; n = n.next){
          System.out.print("|"+n.vertex+"| -> ");
        }
        System.out.print("|"+n.vertex+"| -> ");
        System.out.println("--|");
      }
    }

  }
}
