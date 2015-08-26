//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 03: Write a java program that reads 10 numbers from the user and prints the 
//first odd number in the list

import static java.lang.System.*;
import java.util.*;

public class Lab0803
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];//array of 10 integers
        
        for(int i=0; i<a.length; i++)//array loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();//input
        }
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2!=0)//odd checker
            {
                out.println(a[i]);
                break;//first odd found
            }
        }
        
    }
}