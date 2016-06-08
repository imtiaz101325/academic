// Sk. Imtiaz Ahmed
// 15101054
// CSE221 Lab03 BFS
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader in = new BufferedReader(new FileReader("./file.txt"));

        //build matrix

        int vertex = Integer.parseInt(in.readLine());
        int edge = Integer.parseInt(in.readLine());

        int[][] graph = new int[vertex+1][vertex+1];

        String line;
        while((line = in.readLine()) != null ){

            String[] update = line.split(",");

            int v = Integer.parseInt(update[0]);
            int e = Integer.parseInt(update[1]);

            graph[v][e]++;
            graph[e][v]++;
        }

        // for(int i=0; i<graph.length; i++){
        //     for(int j=0; j<graph[i].length; j++){
        //         System.out.print(graph[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        bfs(graph, 1);
    }

    public static void bfs(int[][] graph, int source){

        int vertex = graph.length;

        int[] color = new int[vertex];
        int[] distance = new int[vertex];
        int[] parent = new int[vertex];

        for(int i=1; i<graph.length; i++){

            color[i] = 0;
            distance[i] = 99999;
            parent[i] = -1;
        }

        color[source] = 1;
        distance[source] = 0;
        parent[source] = -1;
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(source);

        while(queue.peek() != null){

          int current = queue.remove();
          for(int i=1; i < graph[current].length; i++){
            if(graph[current][i] > 0 && color[i] == 0){
              color[i]=1;
              distance[i]=distance[current]+1;
              parent[i]=current;
              queue.add(i);
            }
          }
          color[current] = 2;
        }
        
        //printing paths
        System.out.println("Source: "+source);
        for(int i=1; i<graph.length; i++){
          
          System.out.println("Vertex: "+i);
          System.out.println("\t"+"Distance: "+distance[i]);
          Stack<Integer> st = new Stack<Integer>();
          st.push(i);
          int j=parent[i];
          while(j != -1){
            st.push(j);
            j = parent[j];
          }
          System.out.print("\tPath: ");
          int k = st.pop();
          while(!st.empty()){
            
            System.out.print(k+"->");
            k = st.pop();
          }
          System.out.println(i);
        }

        // for(int i=0; i<graph.length; i++){
        //     for(int j=0; j<graph[i].length; j++){
        //         System.out.print(graph[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        // System.out.println();

        // for(int i=0; i<color.length; i++){
        //   System.out.print(color[i]+" ");
        // }
        // System.out.println();
        // for(int i=0; i<distance.length; i++){
        //   System.out.print(distance[i]+" ");
        // }
        // System.out.println();
        // for(int i=0; i<parent.length; i++){
        //   System.out.print(parent[i]+" ");
        // }
        // System.out.println();
    }
}
