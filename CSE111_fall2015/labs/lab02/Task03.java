//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 2
//Task 3:
//Write a java program that reads 10 numbers from the user, and then prints them in the
//reverse order.

import static java.lang.System.*;
import java.util.*;

public class Task03 {
    
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
        
        //output loop
        out.print("Your input in reverse: ");
        
        for(int i=ara.length-1; i>=0; i--) {
            
            out.print(ara[i]+" ");
        }
        
        out.println();
    }
}