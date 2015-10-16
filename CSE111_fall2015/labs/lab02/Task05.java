//16-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
//Lab 2
//Task 5:
//Write a java program that reads 10 numbers from the user. Then read another number from 
//    the user, and print “yes” if this number exists among the first 10. Print “no” otherwise.



import static java.lang.System.*;
import java.util.*;

public class Task05 {
    
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
        
        
        out.print("Enter a number you whish to find: ");
        int find = input.nextInt();
        boolean exists = false;
        
        //output loop
        for(int i=0; i<ara.length; i++) {
            
            if(ara[i] == find)
                exists = true;
        }
        
        if(exists) {
            
            out.println("Yes");
        }else {
            
            out.println("No");
        }
    }
}