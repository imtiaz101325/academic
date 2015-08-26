//23/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.2.6: Inplement Fermat's algorithm

import static java.lang.System.*;
import java.util.*;

public class Ques3_2_6
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        int num = k.nextInt();//takes a number
        //no primes please
        double ans;
        
        if(num%2==0)
            ans = num/2.0;//2's pair if even
        else
        {
            double root = Math.sqrt(num);
            double error = (root*root) - num;//the error that needs to be 0
            
            int i=1;
            for(; error!=0; i+=2)//generate an odd series
            {
                if(error<0)//if error is smaller than zero
                {
                    error+=((2*root)+i);
                }
                else
                {
                    error-=i;
                }
            }
            
            ans = (((2*root)+i)-i)/2.0;
        }
        
        out.println("The greatest factor is "+ans);
        
    }
}