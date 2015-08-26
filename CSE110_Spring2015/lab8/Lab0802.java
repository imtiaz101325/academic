//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 02: Write a java program that reads 10 numbers from the user. The program then 
//reads a number between 0 to 9, and shows the number at the corresponding index number.
// For instance, if the array is a and the user enters 3, your program should print the
// value a[3]

import static java.lang.System.*;
import java.util.*;

public class Lab0802
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
        
        out.print("Enter a number: ");//prompt
        out.println(a[input.nextInt()]);//output
        
    }
}