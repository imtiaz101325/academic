//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 08: Write a java program that reads 10 numbers from the user, but does not allow
//the user to enter duplicates. This means that if a number has been entered already, 
//the program will not accept it as input again and instead ask the user to enter a 
//different number

import static java.lang.System.*;
import java.util.*;

public class Lab0908
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] a = new int[10];
        
        for(int i=0; i<a.length; i++)//array loop
        {
            out.print("Enter next number: ");
            int temp = input.nextInt();//input
            
            //while loop to take advantage of continue
            int j=0;
            while(j<a.length)
            {
                if(temp==a[j])
                {
                    out.print("Enter a different number: ");
                    temp = input.nextInt();
                    continue;//infinite loop until different number is entered
                }

                j++;
            }

            a[i]=temp;
        }
        
    }
}