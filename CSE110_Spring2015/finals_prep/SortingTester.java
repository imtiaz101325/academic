//April 10, 2015
//Sk. Imtiaz Ahmed
//Sorting class tester

import static java.lang.System.*;
import java.util.*;

public class SortingTester
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(in);

        //taking array to sort
        out.print("Enter how many element present: ");
        int n = input.nextInt();
        int[] ara = new int[n];
        
        for(int i=0; i<ara.length; i++)//input loop
        {
            out.print("Enter next element: ");
            ara[i] = input.nextInt();
        }
        
        
        //sorting option
        
        out.println("Enter 1 for ascending ordered sort.");
        out.println("Enter 2 for descending ordered sort.");
        out.println("Enter 3 for ascending from some position.");
        out.println("Enter 4 for descending from some position.");

        int choice = input.nextInt();

        
    }
}