// Sk. Imtiaz Ahmed
// 15101054
// CSE221 Lab04 DFS
import java.util.*;
import java.io.*;
public class Main{
    
    public static int time;
    public static int[] color;
    public static int[] distance;
    public static int[] finish;
    public static int[] parent;
    
    public static void dfs(int[][] graph){
        
        for(int i=1; i<graph.length; i++){
                
            color[i] = 0;
            parent[i] = -1;
        }
        
        time = 0;
        
        for(int i=1; i<graph.length; i++){
            if(color[i] == 0){
                dfsVisit(graph, i);
            }
        }
        
    }
    
    public static void dfsVisit(int[][] graph, int current){
        color[current] = 1;
        distance[current] = ++time;
        for(int i=0; i<graph[current].length; i++){
            if(graph[current][i] > 0 && color[i] == 0){
                
                parent[i] = current;
                dfsVisit(graph, i);
            }
        }
        color[current] = 2;
        finish[current] = ++time;
        
    }
    
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
        }
        
        vertex = graph.length;

        color = new int[vertex];
        distance = new int[vertex];
        parent = new int[vertex];
        finish = new int[vertex];

        dfs(graph);
        
        System.out.println("Graph");
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Color");
        for(int i=0; i<graph.length; i++){
            System.out.print(color[i]+" ");
        }
        System.out.println();
        
        System.out.println("Distance");
        for(int i=0; i<graph.length; i++){
            System.out.print(distance[i]+" ");
        }
        System.out.println();
        
        System.out.println("Parent");
        for(int i=0; i<graph.length; i++){
            System.out.print(parent[i]+" ");
        }
        System.out.println();
        
        System.out.println("Finish");
        for(int i=0; i<graph.length; i++){
            System.out.print(finish[i]+" ");
        }
        System.out.println();
    }
}