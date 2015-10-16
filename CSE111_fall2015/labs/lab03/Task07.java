//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 3
//Task 7:
//Show examples of the following methods of the String class. Try to  cover as several possible usages/example for each of these methods.
//7a) compareTo
//7b) compareToIgnoreCase
//7c) startsWith
//7d) endsWith
//7e) equals
//7f) equalsIgnoreCase
//7g) indexOf
//7h) lastIndexOf
//7i) length
//7j) replace(char oldChar, char newChar) 
//7k) substring
//7l) toCharArray
//7m) toLowerCase
//7n) toUpperCase
//7o) trim
//7p) valueOf


import static java.lang.System.*;
import java.util.*;

public class Task07 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(in);
       
       out.print("Enter a word: ");
       String word = input.nextLine();
       
       out.print("Enter another word: ");
       String word2 = input.nextLine();
       
       char a = 'a', b = 'b';
       
       out.println(word.compareTo(word2));
       out.println(word.compareToIgnoreCase(word2));
       out.println(word.startsWith("a"));
       out.println(word.endsWith("a"));
       out.println(word.equals(word2));
       out.println(word.equalsIgnoreCase(word2));
       out.println(word.indexOf("a"));
       out.println(word.lastIndexOf("a"));
       out.println(word.length());
       out.println(word.replace(a, b));
       out.println(word.substring(2));
       out.println(word.toCharArray());
       out.println(word.toLowerCase());
       out.println(word.toUpperCase());
       out.println(word.trim());
       
       
       out.println("Enter some numbers: ");
       String anotherWord = input.nextLine();
       int i = Integer.valueOf(anotherWord);
       
       i+=10;
       
       out.println("Check num plus 10: "+i);
                   
       
       
    }
}