//22/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.2.2: Generate a list of divisors of an input

import static java.lang.System.*;
import java.util.*;

public class Ques3_2_2
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        int num = k.nextInt();//take a number
        
        out.println(1);//1 is by default a divisor
        
//        if(num%2==0)//if the number is even then the smallest divisor is 2
//        {
//            out.println(2);
//            out.println(num/2);
//        }
        double lim = Math.sqrt(num);//setting the limiting value to half the number
        //starting from 2 generate all positive numbers less than the limit
        for(int divisor=2; divisor<lim; divisor++)
        {
            //if the number is a divisor
            if(num%divisor==0)
            {
                out.println(divisor);//print the number
                out.println((int)(num/divisor));//and print it's pair
            }
            
        }//starting from 2 generate all positive numbers less than the limit
        //for(double divisor=2; divisor<lim; divisor++)
        //{
        //    //if the number is a divisor
        //    if(num%divisor==0)
        //    {
        //      out.println((int)(num/divisor));//and print it's pair
        //    }
            
        //



    }    
}