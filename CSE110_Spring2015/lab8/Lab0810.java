//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 10: Write a program which reads 5 numbers into an array, sorts/arranges the 
//numbers from low to high and prints all numbers in the array

import static java.lang.System.*;
import java.util.*;

public class Lab0810
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[5];
        
        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<a.length-1; i++)//comparison loop
        {
            int min=a[i], minpos=i;//holds minimun
            
            for(int j=i+1; j<a.length; j++)//finds minimum
            {
                if(a[j]<min)
                {
                    min=a[j];
                    minpos=j;
                }
            }
            
            //swap minimum
            int temp = a[i];
            a[i] = a[minpos];
            a[minpos] = temp;
        }
        
        for(int i=0; i<a.length; i++)//output loop
            out.println(a[i]);
    }
}