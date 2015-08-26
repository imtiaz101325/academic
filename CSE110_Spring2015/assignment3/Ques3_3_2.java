//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.3.2: find gcd without division or mod

import static java.lang.System.*;
import java.util.*;

public class Ques3_3_2
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        //take the numbers form the user  
        out.print("Enter the first number: ");
        int num1 = k.nextInt();
        
        out.print("Enter the second number: ");
        int num2 = k.nextInt();
        
        if(num2>num1)
        {
            num1 = num1+num2;
            num2 = num1-num2;
            num1 = num1-num2;
        }
        
        int temp;
        
        while(Math.abs(num1-num2)!=0)//while the differnce is not zero do
        {
            temp = num2;
            num2 = Math.abs(num1-num2);
            num1 = temp;
        }
        
        out.println("The gdc is "+num1);//print out the remainder
    }
}