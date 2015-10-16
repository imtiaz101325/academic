//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 4:
//print the statistics of occurrence of each character on a line by itself. Assume that user 
//will only give CAPITAL letters. So you will have to count values of CAPITAL letters only.

import static java.lang.System.*;
import java.util.*;

public class Task04 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       int[] ara = new int[91];
       
       for(int i=0; i<word.length(); i++) {
           
           ara[word.codePointAt(i)]++;
       }
       
       for(int i=65; i<ara.length; i++) {
           
           out.println(((char)i)+" which is "+i+" was found "+ara[i]+" times");
       }
    }
}