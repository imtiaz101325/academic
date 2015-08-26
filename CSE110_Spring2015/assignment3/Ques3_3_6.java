//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.6: show the fibonacci numbers don't have common divisors

/*workflow
 1.Generate fibs
 2.check gcd
 */

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_6
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a nubmer: ");//take a number
        int n = k.nextInt();
        
        int a= 0;//first fib
        int b= 1;//second fib
        
        out.println("0 and 1 don't have any divisors in common.");
        
        for(int i=2; i<n; i+=2)
        {
            a = a+b;//next fib
            
            int num1 = a, num2 = b;
            
            int mod = num1%num2;//remainder of the numbers
            while(mod!=0)//while the remainder is not zero do
            {
                num1 = num2;
                num2 = mod;
                mod = num1%num2;
            }
            
            if(num2==1)
                out.println("No common divisors between "+b+" and "+a);//print out the remainder
            
            b = a+b;//next fib
            
            num1 = b;
            num2 = a;
            mod = num1%num2;//remainder of the numbers
            while(mod!=0)//while the remainder is not zero do
            {
                num1 = num2;
                num2 = mod;
                mod = num1%num2;
            }
            
            if(num2==1)
                out.println("No common divisors between "+a+" and "+b);//print out the remainder
        }
        
    }
}