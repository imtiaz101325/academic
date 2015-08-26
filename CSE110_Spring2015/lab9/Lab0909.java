//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 09:Write a java program that reads 10 numbers from the user. Write the program in such 
//a way so that if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output 
//should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.

import static java.lang.System.*;
import java.util.*;

public class Lab0909
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];

        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }

        for(int i=0; i<a.length; i++)//even output loop
        {
            if(a[i]%2==0)
            	out.println(a[i]);
        }
        for(int i=0; i<a.length; i++)//odd output loop
        {
            if(a[i]%2!=0)
            	out.println(a[i]);
        }
    }
}

