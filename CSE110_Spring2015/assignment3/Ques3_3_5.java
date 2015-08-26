//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.1: implement euclid's gdc algorithm with a while loop

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_5
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        //take the numbers form the user  
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
        
        while(num2%2==0)
        {
            num2/=2;
            out.println(2);
        }
        
        double root = Math.sqrt(num2);
        for(int i=3; i<=root; i+=2)
        {
            while(num2%i==0)
            {
                num2/=i;
                out.println(i);
            }
        }
        
        if(num2>1)
            out.println(num2);
    }
}