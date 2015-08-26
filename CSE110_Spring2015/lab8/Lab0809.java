//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 09: Write a program which reads 5 numbers into an array and prints the smallest 
//and largest number and their location in the array

import static java.lang.System.*;
import java.util.*;

public class Lab0809
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[5];
        
        int max=0, min=0, locMax=0, locMin=0;//holds max and min
        
        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<a.length; i++)//array loop
        {
            if(a[i]>max)//stores max
            {
                max = a[i];
                locMax = i;
            }
            if(a[i]<min)//stores min
            {
                min = a[i];
                locMin = i;
            }
        }

        //output
        out.println("Smallest number "+min+" was found at location "+locMin);
        out.println("largest number "+max+" was found at location "+locMax);
        
    }
}