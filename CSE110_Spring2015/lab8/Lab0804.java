//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 04: Write a java program that reads 10 numbers from the user and prints the 
//first even number in the list

import static java.lang.System.*;
import java.util.*;

public class Lab0804
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];//array of 10 integers
        
        for(int i=0; i<a.length; i++)
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();//input
        }
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)//even checker
            {
                out.println(a[i]);
                break;//even found
            }
        }
        
    }
}