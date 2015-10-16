//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 3:
//There are two ways to print ASCII code / Unicode / int value of each character.
//String s = “Bye”;
//Either,
//1) char ch = s.charAt(0);
//int codeForCh = (int) ch;
//System.out.println(codeForCh); // this line would print 66 which is the code for character B
//Or, 
//2) int codeForCh = s.codePointAt(0);
//System.out.println(codeForCh); // this line would print 66 which is the code for the character B
//
//Now your task is to input a word into a String. Then print code for each character in the 
//    String using the 2nd method discussed above. Use any means necessary.


import static java.lang.System.*;
import java.util.*;

public class Task03 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       
       for(int i=0; i<word.length(); i++) {
           
           out.print(word.charAt(i));
           out.println(": "+word.codePointAt(i));
       }
    }
}