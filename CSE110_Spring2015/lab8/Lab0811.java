//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 11: Write a program which reads 5 numbers into an array, sorts/arranges the 
//numbers from high to low and prints all numbers in the array

import static java.lang.System.*;
import java.util.*;

public class Lab0811
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
            int max=a[i], maxpos=i;//holds maximum
            
            for(int j=i+1; j<a.length; j++)//finds maximum
            {
                if(a[j]>max)
                {
                    max=a[j];
                    maxpos=j;
                }
            }
            
            //swap maximum
            int temp = a[i];
            a[i] = a[maxpos];
            a[maxpos] = temp;
        }
        
        for(int i=0; i<a.length; i++)//output loop
            out.println(a[i]);
    }
}