//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 04: Write a java program that reads 20 numbers from the user, and then prints 
//only the even numbers in reverse order

import static java.lang.System.*;
import java.util.*;

public class Lab0904
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[20];
        
        for(int i=0; i<a.length; i++)//input loop
        {
            out.print("Enter next number: ");
            a[i] = input.nextInt();
        }
        
        for(int i=a.length-1; i>=0; i--)//reverse array loop
        {
            if(a[i]%2==0)//even only
                out.println(a[i]);
        }
        
    }
}