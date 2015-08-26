//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 01: Write a java program that would input three numbers from the user and print 
//sum, then the first number, then the 2nd number followed by 3rd number. If user 
//enters 10, 20, 30. Then output should be 60, 10, 20, and 30.

import static java.lang.System.*;
import java.util.*;

public class Lab0801
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[3];//array of 3 integers
        int sum = 0;//holds the sum 
        
        for(int i=0; i<3; i++)//array loop
        {
            out.print("Enter a number: ");//prompt
            a[i] = input.nextInt();//input
            sum += a[i];//sum
        }
        
        out.println(sum);//print sum
        
        //print array
        for(int i=0; i<a.length; i++)
        {
            out.println(a[i]);
        }
    }
}