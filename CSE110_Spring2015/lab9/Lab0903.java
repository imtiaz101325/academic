//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 03: Write a java program that reads 10 numbers from the user, and then prints 
//them in the reverse order.

import static java.lang.System.*;
import java.util.*;

public class Lab0903
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
            out.println(a[i]);
        }
        
    }
}