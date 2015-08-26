//22/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.2.4: Design and implement an algorithm that finds the smallest positive integer
//that has 

import static java.lang.System.*;
import java.util.*;

public class Ques3_2_4
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        int mostDivisor=1;//number with most divisor
        int previosDivisors=0;//it's divisors
        
        for(int i=1; i<=100; i++)
        {
            int hasDivisor = 0;
            double lim = Math.sqrt(i);//setting the limiting value to half the number
            //starting from 2 generate all numbers less than limit
            for(int divisor=2; divisor<lim; divisor++)
            {
                if(i%divisor==0)//check if exact divisor
                {
                    hasDivisor+=2;
                }            
            }
            
            if(hasDivisor>previosDivisors)
            {    
                mostDivisor = i;
                previosDivisors = hasDivisor;
            }           
            
        }
        
        out.println(mostDivisor+" has the most divisors.");
    }    
}