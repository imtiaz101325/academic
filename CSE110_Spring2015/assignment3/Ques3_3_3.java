//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.1: gcd of n integers

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_3
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter how many numbers: ");//ask for how many numbers
        int n = k.nextInt();
        
        //take two numbers form the user
        out.print("Enter the first number: ");
        int num1 = k.nextInt();
        
        out.print("Enter the second number: ");
        int num2 = k.nextInt();
        
        int mod = num1%num2;//remainder of the numbers
        while(mod!=0)//while the remainder is not zero do
        {
            num1 = num2;
            num2 = mod;
            mod = num1%num2;
        }
        
        n = n-2;
        
        for(int i=1; i<=n; i++)//start a loop of n numbers
        {
            
            //take another numbers form the user
            out.print("Enter the next number: ");
            num1 = k.nextInt();
            
            mod = num1%num2;//remainder of the numbers
            while(mod!=0)//while the remainder is not zero do
            {
                num1 = num2;
                num2 = mod;
                mod = num1%num2;
            }      
            
            
        }
        
        out.println("The greatest common divisor is "+num2);
    }
}