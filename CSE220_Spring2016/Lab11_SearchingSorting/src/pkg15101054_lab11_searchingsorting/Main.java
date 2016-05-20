/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg15101054_lab11_searchingsorting;

/**
 *
 * @author 15101054
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] a = {1,8,-4,1,0,3,-2,3,5,3,-2};

        int [] b = setup(a); // create Auxiliary array

        int min = findMin(a); // minium value of a
        int shiftAmount = Math.abs(min) ; // find shiftAmount: |min| of array a
        printAux(b,shiftAmount); // prints the auxiliary array, Thus shows the count of each key


        System.out.println(keyIndexSearch(b,-2,shiftAmount)); // Searching for -2 in a, Should print: true
        System.out.println(keyIndexSearch(b,-4,shiftAmount)); // Searching for -4 in a, Should print: true
        System.out.println(keyIndexSearch(b,8,shiftAmount)); // Searching for 8 in a, Should print: true
        System.out.println(keyIndexSearch(b,-5,shiftAmount)); // Searching for -5 in a, Should print: false
        System.out.println(keyIndexSearch(b,-6,shiftAmount)); // Searching for 6 in a, Should print: false
        System.out.println(keyIndexSearch(b,9,shiftAmount)); // Searching for 9 in a, Should print: false

        printSorted(b,shiftAmount); //Key indexed sort   


      }

      //finds the Minimum value of array a
      public static int findMin(int [] a){
        
          int min = a[0];
          for(int i=1; i<a.length; i++){
              
              if(a[i] < min){
                  min = a[i];
              }
          }
          
          return min;
      }

        //finds the Maximum value of array a
      public static int findMax(int [] a){
        
          
          int max = a[0];
          for(int i=1; i<a.length; i++){
              
              if(a[i] > max){
                  max = a[i];
              }
          }
          
          return max;
      }


      // Creates the auxiliary array B
      public static int [] setup(int [] a){

        // Find max and min of array a
        int max = findMax(a);
        int min = findMin(a);
        int k = Math.abs(min); // shift amount, here k = 4

        //Create auxiliary array
        int [] b = new int[k+max+1];

        for(int i=0; i<b.length; i++){

            for(int j=0; j<a.length; j++){

                if(a[j] == (i-k)){
                    
                    b[i]++;
                    
                }
            }
        }

        return b;
      }

      //Prints the Auxiliary Array
      public static void printAux(int [] b, int k){       
        for(int i = 0; i<b.length; i++){
          System.out.println(i-k+" was found --> " + b[i] + " times."); // for a[i]= -4, b[0] will be incremented
        } 

      }

      //Key Indexed Search, check range of key first
      // param b --> Auxiliary array
      // param key --> element that is to be searched in array a
      // param k --> shift amount
      public static boolean keyIndexSearch(int [] b, int key, int k){
          
          if((key+k) > 0){
              
              return true;
          }          
          
          return false;
      }

      // key indexed sort, param b --> auxiliary array, para k --> shift amount
      public static void printSorted(int [] b, int k){
        System.out.print("Array a Sorted: ");
        
        for(int i=0; i<b.length; i++){
            
            for(int j=0; j<b[i]; j++){
                
                System.out.print(i-k+" ");
            }
        }
        System.out.println();
      }
}
