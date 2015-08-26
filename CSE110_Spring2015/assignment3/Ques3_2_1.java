//22/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.2.1: Modify the samllest factor fining algorithm in the book so that 
//the square root of n need not be computed

import static java.lang.System.*;
import java.util.*;

public class Ques3_2_1
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
        else
        {
            double lim = num/2.0;//setting the limiting value to half the number
            //starting for 3 generate odd numbers less than the limit
            for(int divisor=3; divisor<lim; divisor+=2)
            {
                if(num%(divisor)==0)//check if the current is the exact divisor
                {
                    ans = divisor;
                    break;//no need to go anyfurther
                }
                else
                    ans = 1;
            }
        }
        
        out.println("the smallest divisor of "+num+" is "+ ans);
    }
}