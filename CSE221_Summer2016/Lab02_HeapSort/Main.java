// Sk. Imtiaz Ahmed
// 15101054
// Lab02: Heap Sort

import java.io.*;
// import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new FileReader("./HEAP_Input.txt"));
        
        int[] arr = new int[Integer.parseInt(in.readLine())];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(in.readLine());
        }
        
        maxHeapify(arr, 1, arr.length);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void maxHeapify(int[] array, int index, int size){
        
        int left = 2*index+1;
        int right = 2*index+2;
        
        int largest;
        if( left <= size && array[left] > array[index] )
            largest = left;
        else
            largest = index;
        
        if( right <= size && array[right] > array[largest] )
            largest = right;
        
        if(largest != index){
            int temp = array[largest];
            array[largest] = array[index];
            array[index] = temp;
            
            maxHeapify(array, largest, size);
        }
    }
}