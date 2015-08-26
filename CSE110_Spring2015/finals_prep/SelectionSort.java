//April 8, 2015
//Sk. Imtiaz Ahmed
//Self practice
//Implimenting Selection Sort

import static java.lang.System.*;
import java.util.*;

public class SelectionSort
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
            // int min = ara[0];//estimated minimum
            // int pos = 0;//position in array
            
            int min, pos;//estimated minimum and it's position
            
            for(int i=1; i<ara.length; i++)//sort loop
            { 
                min = ara[i-1];
                pos = i-1;
                
                for(int j=i; j<ara.length; j++)//selection loop
                {
                    if(ara[j]<min)//comarison
                    {
                        //save element and position
                        min = ara[j];
                        pos = j;
                    }
                }
                
                //swap block
                ara[pos] = ara[i-1];
                ara[i-1] = min;
                
            }
        }
        else if(choice==2)//descendign sort
        {
            for(int i=1; i<ara.length; i++)//sort loop
            {
                // int max = ara[i-1];//estimated maximum
                // int pos = i-1;//position in array
                
                // for(int j=i; j<ara.length; j++)//selection loop
                // {
                //  if(ara[i]<max)//comarison
                //  {
                //   //save element and position
                //   max = ara[i];
                //   pos = i;
                //  }
                // }
                
                // //swap block
                // int temp = ara[i-1];
                // ara[i-1] = max;
                // ara[pos] = temp;
                
                int max, pos;//estimated minimum and it's position
                
                
                max = ara[i-1];
                pos = i-1;
                
                for(int j=i; j<ara.length; j++)//selection loop
                {
                    if(ara[j]>max)//comarison
                    {
                        //save element and position
                        max = ara[j];
                        pos = j;
                    }
                }
                
                //swap block
                ara[pos] = ara[i-1];
                ara[i-1] = max;
                
                
            }
        }
        else if(choice==3)//ascending form position
        {
            //choice display
            out.print("Positions: [ ");
            for(int some=1; some<=ara.length; some++)
            {
                out.print(some+" ");
            }
            out.println("]");
            out.print("Select position: ");

            int i = input.nextInt();//choice
            int min, pos;//estimated minimum and it's position
            
            for(; i<ara.length; i++)//sort loop
            { 
                min = ara[i-1];
                pos = i-1;
                
                for(int j=i; j<ara.length; j++)//selection loop
                {
                    if(ara[j]<min)//comarison
                    {
                        //save element and position
                        min = ara[j];
                        pos = j;
                    }
                }
                
                //swap block
                ara[pos] = ara[i-1];
                ara[i-1] = min;
                
            } 
        }
        else
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
            int max, pos;//estimated minimum and it's position

            for(; i<ara.length; i++)//sort loop
            {                                
                max = ara[i-1];
                pos = i-1;
                
                for(int j=i; j<ara.length; j++)//selection loop
                {
                    if(ara[j]>max)//comarison
                    {
                        //save element and position
                        max = ara[j];
                        pos = j;
                    }
                }
                
                //swap block
                ara[pos] = ara[i-1];
                ara[i-1] = max;
                
                
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