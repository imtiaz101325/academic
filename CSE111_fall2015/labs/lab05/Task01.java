//16/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab 5
//Task 01: Trim() method

public class Task01{
    
    public static char [] trim(char [] input){
        
        boolean[] indexStore = new boolean[input.length];//store indexes of spaces
        
        for(int i = 0; i<input.length; i++) {
            
            if(input[i] == ' ' && input[i-1] == ' ') {
                
                indexStore[i] = true;
            }
        }
        
        char[] newInput = new char[input.length];//new character array
        
        for(int i=0, j=0; i<input.length; i++) {
            
            if(!indexStore[i]) {
                
                newInput[j] = input[i];//logic excludes excess spaces
                j++;
            }
        }
        
        return newInput;
    }
    public static void main(String [] args){
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
        char []  output = trim(input);
        for (int i = 0; i< output.length; i++){
            System.out.print(output[i]);
        }
        System.out.println("");    
    }
}