//16/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//2.9.2: Design an algorithm to convert a decimal represtenation for a number to the 
//corresponding character string representation 

import static java.lang.System.*;
import java.util.*;

public class Ques2_9_2
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        int num = k.nextInt();//takes an integer form the user
        
        String numString = "";
        
        for(;num>0;num/=10)
        {
            numString = ((char)((int)'0'+num%10)) + numString;//converts each digit
        }//to char and adds it to a string
        
        out.println(numString);//prints the result
    }
}



