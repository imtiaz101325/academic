//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 08: Write a program which reads 5 numbers into an array and prints the largest 
//number and its location in the array

import static java.lang.System.*;
import java.util.*;

public class Lab0808
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[5];
        
        int max=0, locMax=0;//holds maximum and it's location
        
        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)//stores maximum
            {
                max = a[i];
                locMax = i;
            }
        }
        out.println("largest number "+max+" was found at location "+locMax);//output
        
    }
}