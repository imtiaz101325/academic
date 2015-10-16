//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 2
//Task 6:
//Write a java program that reads 15 numbers from the user, all the numbers within the 
//    range 0-9. Then print the number of times each number has been entered by the user



import static java.lang.System.*;
import java.util.*;

public class Task06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(in);
        
        int[] ara = new int[10];
        
        //input loop
        out.println("Enter 15 numbers within the range 0-9: ");
        
        for(int i=0; i<15; i++) {
            
            out.print(i+1+": ");
            ara[input.nextInt()]++;
            out.println();
        }
        
        out.println("You entered: ");
        //output loop
        for(int i=0; i<ara.length; i++) {
            
            out.printf("%d: %d times\n", i, ara[i]);
        }
    }
}