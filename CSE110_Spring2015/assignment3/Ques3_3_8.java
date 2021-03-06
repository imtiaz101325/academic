//24/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.8: algorithm that finds lcm other than the numbers themslves

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_8
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        //take the numbers form the user  
        out.print("Enter the first number: ");
        int num1 = k.nextInt();
        
        out.print("Enter the second number: ");
        int num2 = k.nextInt();
        
        int a = num1, b = num2;
        
        int mod = num1%num2;//remainder of the numbers
        while(mod!=0)//while the remainder is not zero do
        {
            num1 = num2;
            num2 = mod;
            mod = num1%num2;
        }
        
        //this gives us the gcd
        //we knwo gcd*lcm=num1*num2
        
        int lcm = (a*b)/num2;

        //if the lcm is one of the number just muliply by 2 ^_^

        if(a==lcm || b==lcm)
            lcm *= 2;
        
        
        out.println("The smallerst common multiple is "+lcm);
        
        
    }
}