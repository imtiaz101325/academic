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
        
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        
        bfs(graph, 3);
        
        // for(int i=0; i<graph.length; i++){
        //     for(int j=0; j<graph[i].length; j++){
        //         System.out.print(graph[i][j]+" ");
        //     }
        //     System.out.println();
        // }
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
        
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<graph.length; i++){
            
        }
    }
}