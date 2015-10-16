//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 2
//Task 7:
//Write a java program that reads 10 numbers from the user. After reading each number, 
//    print all the numbers that have been entered so far.

import static java.lang.System.*;
import java.util.*;

public class Task07 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(in);
        
        int[] ara = new int[10];
        
        //input loop
        out.println("Enter 10 numbers: ");
        
        for(int i=0; i<ara.length; i++) {
            
            out.print(i+1+": ");
            ara[i] = input.nextInt();
            out.println();
        }
        
        out.println("You entered: ");
        //output loop
        for(int i=0; i<ara.length; i++) {
            
            out.printf(ara[i]+" ");
        }
        
        out.println();
    }
}