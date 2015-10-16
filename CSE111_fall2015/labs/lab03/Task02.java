//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 2:
//Input a word into a String. Print each character on a line by itself.  
//    Use charAt method.


import static java.lang.System.*;
import java.util.*;

public class Task02 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       
       for(int i=0; i<word.length(); i++) {
           
           out.println(word.charAt(i));
       }
    }
}