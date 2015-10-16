//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 1:
//Input a word into a String. Print the length of the word, that is, how many characters
//    / symbols / spaces are there.
//Sample input 1:
//Programming
//Sample output 1:
//11
//
//Sample input 2:
//hunger
//Sample output 2:
//6



import static java.lang.System.*;
import java.util.*;

public class Task01 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       
       out.println("Your word has "+word.length()+" characters.");
    }
}