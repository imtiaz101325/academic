//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.4: implement euclid's gdc algorithm after reducing common multiples of 2

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_4
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        //take the numbers form the user  
        out.print("Enter the first number: ");
        int num1 = k.nextInt();
        
        out.print("Enter the second number: ");
        int num2 = k.nextInt();

        int gcd=1;

        while(num1%2==0 && num2%2==0)
        {
            gcd *= 2;
            num1 /= 2;
            num2 /= 2;
        }
        
        int mod = num1%num2;//remainder of the numbers
        while(mod!=0)//while the remainder is not zero do
        {
            num1 = num2;
            num2 = mod;
            mod = num1%num2;
        }

        gcd *= num2;
        
        out.println("The gdc is "+  gcd);//print out the remainder
    }
}