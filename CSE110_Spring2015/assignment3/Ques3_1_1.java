//16/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.1.1: Impliment the square root finding algorithm disscussed in the book

import static java.lang.System.*;
import java.util.*;

public class Ques3_1_1
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        int num = k.nextInt();//take a number to find squre root
        
        double root = num/2.0;//let's guess the root is half the number
        
        //while the squre of the assumed root is bigger than the number: subtract 1
        while(num < root*root)
        {
            root-=1;
        }//end of the loop
        
        //while the square of the root is less than the number: add .1
        while(num > root*root)
        {
            root+=.1;
        }//end of the loop
        
        //this should be sufficient for the roots that are whole number
        
        //we could add more loop for greater precision
        
        out.println(root);
        
        
    }
}