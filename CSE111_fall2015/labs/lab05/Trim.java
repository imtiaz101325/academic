//16/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Task 01: Trim() method

public class Trim{
    
    public static char [] trim(char [] input){
        
        int[] indexStore = new int[input.length];//store indexes of spaces
        int indexStoreLength = 1;//indexStore.length
        
        for(int i = 0; i<input.length; i++) {
            
            if(input[i] == ' ' & input[i+1]) {
            
                indexStore[indexStoreLength-1] = i+1;
                indexStoreLength++;
            }
        }
    }
    public static void main(String [] args){
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
//        char []  output = trim(input);
//        for (int i = 0; i< output.length; i++){
//            System.out.print(output[i]);
//        }
//        System.out.println("");    
    }
}