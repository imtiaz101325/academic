//1/4/2015
//Sk. Imtiaz Ahmed
//Assignment 4 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//Finding perfect numbers

import static java.lang.System.*;
import java.util.*;

public class Prob3_5_4
{
        public static void main(String[] args) 
        {
            for(int i=2; i<=500; i++)
            {
                int[] divisors = new int[100];
            
                divisors[0]=1;//1 is by default a divisor

                double lim = Math.sqrt(i);//setting the limiting value to half the number
                //starting from 2 generate all positive numbers less than the limit
                for(int divisor=2, j=1; divisor<lim; divisor++)
                {
                    //if the number is a divisor
                    if(i%divisor==0)
                    {
                        divisors[j]= divisor;//divisor
                        j++;
                        divisors[j]= i/divisor;//and it's pair
                        j++;
                    }
                    
                }

                int sum = 0;
                for(int j=0; j<divisors.length; j++)
                {
                    if(divisors[j]==0)
                        break;
                    else
                        sum += divisors[j];
                }

                if(sum == i)
                    out.println(i+" is a perfect number.");
            }
        }
}
