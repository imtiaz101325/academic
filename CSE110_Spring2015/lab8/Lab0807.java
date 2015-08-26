//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 07: Write a program which reads 5 numbers into an array and prints the largest 
//number

import static java.lang.System.*;
import java.util.*;

public class Lab0807
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[5];
        
        int max=0;//holds maximum
        
        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
                max = a[i];//stores maximum
        }
        
        out.println(max);//prints maximum
        
    }
}