//22/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.2.5: Modify the samllest factor finding algorithm in the book so that 
//that the series of checks exclued multiples of 2 AND 3

import static java.lang.System.*;
import java.util.*;

public class Ques3_2_5
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        int num = k.nextInt();//take a number
        
        int ans=3;//desired output default to 3
        
        if(num%2==0)//if the number is even then the smallest divisor is 2
        {
            ans = 2;
        }
        else if(num%3==0)//checks if three is an exact divisor
        {
            ans = 3;
        }
        else
        {
            double lim = Math.sqrt(num);//setting the limiting value to the square root the number
            
            //starting for 3 generate odd numbers less than the limit
            for(int divisor=5, i=2; divisor<=lim; divisor+=i, i = 6-i)
            {
                if(num%divisor==0)//check if the current is the exact divisor
                {
                    ans = divisor;
                    break;//no need to go any further
                }
                else
                    ans = 1;
//                
//                if(i%2==0)
//                    divisor+=4;
//                else
//                    divisor+=2;
            }
        }
        
        out.println("the smallest divisor of "+num+" is "+ ans);
    }
}