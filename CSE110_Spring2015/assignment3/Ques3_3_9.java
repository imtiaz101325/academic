//24/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.7: algorithm that finds lcm

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_9
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        //take the numbers form the user  
        out.print("Enter the numerator of the first number: ");
        int num1 = k.nextInt();
        out.print("Enter the denomanatroator of the first number: ");
        int denom1 = k.nextInt();
        
        out.print("Enter the numerator of the second number: ");
        int num2 = k.nextInt();
        out.print("Enter the denomanatroator of the second number: ");
        int denom2 = k.nextInt();
        
        int product = denom1*denom2;//store the denominator product
        
        int mod = denom1%denom2;//remainder of the numbers
        while(mod!=0)//while the remainder is not zero do
        {
            denom1 = denom2;
            denom2 = mod;
            mod = denom1%denom2;
        }
        
        //this gives us the gcd
        //we knwo gcd*lcm=num1*num2
        
        int lcm = product/denom2;

        //now to sum them
        
        int sum = (num1*lcm/denom1)+(num2*lcm/denom2);
        
        out.println("The summation is "+sum+"/"+lcm);
        
        
    }
}