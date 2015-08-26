//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 06: Write a java program that reads 15 numbers from the user, all the numbers 
//within the range 0-9. Then print the number of times each number has been entered 
//by the user

import static java.lang.System.*;
import java.util.*;

public class Lab0906
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];
        
        for(int i=0; i<15; i++)//a loop for 15 numbers
        {
           out.print("Enter a number with in 0 to 9: ");
           
           a[input.nextInt()]++;//increment the value of the location
        }
        
        for(int i=0; i<a.length; i++)//output loop
        {
            out.println("You have entered "+i+", "+a[i]+" times."); 
        }
        
    }
}