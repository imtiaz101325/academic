//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 05: Write a java program that reads 10 numbers from the user. Then read another 
//number from the user, and print “yes” if this number exists among the first 10. 
//Print “no” otherwise

import static java.lang.System.*;
import java.util.*;

public class Lab0905
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
        
        out.println("Enter a number to find: ");
        int n = input.nextInt();//target
        
        boolean bul = false;//true if found
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==n)
            {
                out.println("Yes");
                bul = true;
                break;
            }
        }
        
        if(!bul)//if not found
            out.println("No");
        
    }
}