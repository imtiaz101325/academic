/*
CSE221
Lab Task 1: Implimenting Adjecency Matrix
Author: Sk. Imtiaz Ahmed
ID: 15101054
*/

import java.util.*;
import java.io.*;

public class Task{

  public static void main(String[] args) throws Exception {

    //path to file kept the in the same directory
    String fileName = "./file.txt";

    //file reader
    BufferedReader in = new BufferedReader(new FileReader(fileName));

    //Array of custom node objects
    Node[] arrayList = new Node[Integer.parseInt(in.readLine())];//size set to
                                                                //number of vertex
    //initializing array with the vertex names
    for(int i=0; i<arrayList.length; i++){

      arrayList[i] = new Node(i+1, null);
    }

    String line;
    while((line = in.readLine()) != null){

      String[] input = line.split(",");

      int source = Integer.parseInt(input[0]);
      int destination = Integer.parseInt(input[1]);

      // //edge case: manually set first node after head
      // if(arrayList[source-1].next == null){
      //   arrayList[source-1].next = new Node(destination, null);
      // }else{
      //   Node n = arrayList[source-1];
      //   for(;n.next != null; n = n.next);//find last node
      //   n.next = new Node(destination, null);
      // }

      arrayList[source-1].add(destination);
    }

    //output loop
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
