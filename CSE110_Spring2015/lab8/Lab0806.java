//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 06: Write a java program that reads 10 numbers from the user and prints the 
//last even number in the list

import static java.lang.System.*;
import java.util.*;

public class Lab0806
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
        
        for(int i=a.length-1; i>0; i--)//reverse array loop
        {
            if(a[i]%2==0)
            {
                out.println(a[i]);
                break;//even found
            }
        }
        
    }
}