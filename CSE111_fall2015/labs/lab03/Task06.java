//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 6:
//Input a word into a String. 
//Print the word.
//Print the word again after adding “==THE END==” at the end of the word.
//Then print the word again. 
//Your whole program may contain the word “String” at most two times.
//You HAVE TO to use concat method. 
//You are NOT allowed use ‘+’ operator to concatenate (join?) words. 


import static java.lang.System.*;
import java.util.*;

public class Task06 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       out.println(word);
       out.println(word.concat("==THE END=="));
       out.println(word);
    }
}