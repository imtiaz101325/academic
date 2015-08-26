//16/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//2.9.1: Design an algorithm that will handle conversions to decimal where the input
//character string may contain a decimal point

import static java.lang.System.*;
import java.util.*;

public class Ques2_9_1
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        int tens=0;//numbers before radix point
        double tenths=0;//numbers after radix point
        boolean radix=false;//is radix point present
        double power=1;//required to sum fractions
        
        //take the number a string
        out.print("Enter a number: ");
        String num = k.next();
        
        //start a loop
        //using string methods do these for each character of the string
        for(int i=0; i<num.length(); i++)
        {
            if(num.charAt(i)=='.')//determines if the character is '.'
            {
                radix=true;
                continue;//back to top
            }
            
            if(radix)//once a radix poin has been foud do these
            {
                power *= 10;//used to add digit to the left of current
                double digit = (int)num.charAt(i)-(int)'0';//converts character to number        
                tenths += (digit/power);//adds number
                
                
            }
            else//no radix has been found yet so do these
            {
                int digit = (int)num.charAt(i)-(int)'0';//converts character to number
                
                tens = (tens*10)+digit;//adds number
            }
        }
        
        double ans = tens+tenths;//adds up the nubmer before and after radix point
        
        out.println(ans);//prints the output
    }
}