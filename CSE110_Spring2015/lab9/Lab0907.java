//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 07: Write a java program that reads 10 numbers from the user. After reading 
//each number, print all the numbers that have been entered so far

import static java.lang.System.*;
import java.util.*;

public class Lab0907
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];
        
        for(int i=0; i<a.length; i++)//array loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();//input
            
            out.print("You have entered ");
            
            for(int j=0; j<=i; j++)//shows input so far
            {
                if(j==i)
                {
                    out.println(a[j]+".");
                }
                else
                    out.print(a[j]+", ");
            }
        }
        
    }
}