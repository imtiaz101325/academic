//April 9, 2015
//Sk. Imtiaz Ahmed
//Self practice
//Bubble Sosrt

import static java.lang.System.*;
import java.util.*;

public class BubbleSrot
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
        
        if(choice<1||choice>4)//wrong input
        {
            out.println("Wrong choice. Please start over.");
        }
        else if(choice==1)//ascending sort
        {
            for(int i=0; i<ara.length; i++)
            {
                for(int j=1; j<ara.length-i; j++)
                {
                    if(ara[j]<ara[j-1])
                    {
                        int temp = ara[j-1];
                        ara[j-1] = ara[j];
                        ara[j]   = temp;
                    }
                }
            }
        }
        else if(choice==2)//descending sort
        {
            for(int i=0; i<ara.length; i++)
            {
                for(int j=1; j<ara.length-i; j++)
                {
                    if(ara[j]>ara[j-1])
                    {
                        int temp = ara[j-1];
                        ara[j-1] = ara[j];
                        ara[j]   = temp;
                    }
                }
            }
        }
        else if(choice==3)//ascending form position
        {
            //choice loop
            out.print("Positions: [ ");
            for(int some=1; some<=ara.length; some++)
            {
                out.print(some+" ");
            }
            out.println("]");
            out.print("Select position: ");

            int i = input.nextInt();//choice

            for(i-=1; i<ara.length; i++)
            {
                for(int j=i+1; j<ara.length-i; j++)
                {
                    if(ara[j]<ara[j-1])
                    {
                        int temp = ara[j-1];
                        ara[j-1] = ara[j];
                        ara[j]   = temp;
                    }
                }
            }

        }
        else//descending form position
        {
            //choice loop
            out.print("Positions: [ ");
            for(int some=1; some<=ara.length; some++)
            {
                out.print(some+" ");
            }
            out.println("]");
            out.print("Select position: ");

            int i = input.nextInt();//choice

            for(i-=1; i<ara.length; i++)
            {
                for(int j=i+1; j<ara.length-i; j++)
                {
                    if(ara[j]>ara[j-1])
                    {
                        int temp = ara[j-1];
                        ara[j-1] = ara[j];
                        ara[j]   = temp;
                    }
                }
            }
        }
        
        //print array
        out.print("[ ");
        for(int each: ara)
        {
            out.print(each+" ");
        }
        out.println("]");
        
    }
}