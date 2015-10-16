//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 5:
//Input a word into a String. 
//Print the word.
//Print the word again after adding “==THE END==” at the end of the word.
//Then print the word again. 
//Your whole program may contain the word “String” at most two times.
//You are NOT allowed to use concat method. 
//You ARE allowed use ‘+’ operator to concatenate (join?) words. 

import static java.lang.System.*;
import java.util.*;

public class Task05 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       out.println(word);
       out.println(word+"==THE END==");
       out.println(word);
    }
}