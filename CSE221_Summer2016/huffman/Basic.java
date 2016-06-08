// Sk. Imtiaz Ahmed
// 15101054
// CSE221: Huffman Coding Implimentation


import java.util.*;
import java.io.*;
public class Basic{

  public static void main(String[] args) throws Exception {

    PriorityQueue<Node> pQueue = new PriorityQueue<Node>(256, new NodeComparator());

    BufferedReader in = new BufferedReader(new FileReader("./file.txt"));

    //tally to hold character occurance
    int[] tally = new int[256];

    //read from file to PQ
    String line;
    while((line = in.readLine()) != null ){

      char[] charLine = line.toCharArray();

      //increament tally
      for(int i=0; i<charLine.length; i++){
        tally[charLine[i]]++;
      }
    }

    in.close();

    //print tally
    // for(int i=(int)'A'; i<=(int)'z'; i++){
    //   System.out.println(((char)i)+": "+tally[i]);
    // }

    //add tally-ed node to pq
    for(int i=0; i<tally.length; i++){

      if(tally[i] > 0){
        pQueue.add(new Node(tally[i],(char) i, null, null));
      }
    }

    //print pq **rest of the code won't work unless this block is commented
    // while(pQueue.size() != 0){
    //   System.out.println(pQueue.remove());
    // }

    //build tree
    while(pQueue.size() > 1){

      Node first = pQueue.remove();
      Node second = pQueue.remove();
      pQueue.add(new Node(first.charLength+second.charLength,null,first,second));
    }

    //final huffman Tree
    Node huffmanTree = pQueue.remove();

    //print the tree
    // treePrint(huffmanTree);

    //array for storing character code
    char[][] encode = new char[256][8];

    charCode(huffmanTree,encode,"");

    //print code array
    // for(int i=(int)'A'; i<=(int)'z'; i++){
    // for(int i=0; i<encode.length; i++){
    //   if(encode[i].length < 8){
    //     System.out.print((char)i+": ");
    //     for(int j=0; j<encode[i].length; j++){
    //
    //       System.out.print(encode[i][j]);
    //     }
    //     System.out.println();
    //   }
    // }

    ObjectOutputStream out;
    out = new ObjectOutputStream( new FileOutputStream("./output.ser"));
    in = new BufferedReader(new FileReader("./file.txt"));

    // String debugOut = "";
    while((line = in.readLine()) != null ){

      char[] charLine = line.toCharArray();

      int bite = 0;
      int biteCount = 0;
      for(int i=0; i<charLine.length; i++){

        char[] currentCode = encode[(int)charLine[i]];
        for(int j=0; j<currentCode.length; j++){

          bite = bite << 1 | ((int)currentCode[j] - (int)'0');
          biteCount++;
          // debugOut+=currentCode[j];
          // if(biteCount > currentCode.length){
            // System.out.println(bite);
            // System.out.println(debugOut);
            // bite = 0;
            // biteCount = 1;
            // debugOut = "";
          // }
          if(biteCount > 7){
            out.write(bite);
            biteCount = 0;
          }
        }

      }
    }

    in.close();
    out.flush();
    out.close();

    // System.out.println(debugOut);

    //decompress

    FileInputStream fileIn = new FileInputStream("./output.ser");
    out = new ObjectOutputStream( new FileOutputStream("./output.txt"));

    int input;
    Node tree = huffmanTree;
    //reading a byte at a time
    while((input = fileIn.read()) != -1){
      int temp = input;
      for(int i=0; i<8; i++){
        //this line yeilds every bit form left to right
        int bit = (temp >>> (8-i-1)) & 1;
        //point according to bit value
        if(bit == 0){
          tree = tree.left;
        }else{
          tree = tree.right;
        }
        //if the pointing at a character, print it(for now)
        if(tree.character != null){
          System.out.print(tree.character);
          tree = huffmanTree;
        }
        temp = input;
      }

    }
    System.out.println();


  }

  //huffman tree trevarsal
  public static void charCode(Node tree, char[][] array, String code){

    if(tree.character != null){
      array[tree.character.toString().codePointAt(0)] = code.toCharArray();
      // code = "";
    }else{

      charCode(tree.left,array,code+"0");

      charCode(tree.right,array,code+"1");
    }
  }

  //debug tool
  // public static void treePrint(Node tree){
  //   if(tree.character != null){
  //     System.out.print(tree.character+" ");
  //     System.out.println(tree.charLength);
  //   }else{
  //     treePrint(tree.left);
  //     treePrint(tree.right);
  //
  //   }
  // }
}
