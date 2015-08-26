//1/4/2015
//Sk. Imtiaz Ahmed
//Assignment 4 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//Finding amicable numbers

import static java.lang.System.*;
import java.util.*;

public class Prob3_5_3
{
        public static void main(String[] args)
        {

            Scanner k = new Scanner(in);

            out.print("Please enter a number: ");
            int num1 = k.nextInt();

            out.print("Please enter another number: ");
            int num2 = k.nextInt();


            int[] divisors = new int[100];
        
            divisors[0]=1;//1 is by default a divisor

            double lim = Math.sqrt(num1);//setting the limiting value to half the number
            //starting from 2 generate all positive numbers less than the limit
            for(int divisor=2, j=1; divisor<lim; divisor++)
            {
                //if the number is a divisor
                if(num1%divisor==0)
                {
                    divisors[j]= divisor;//divisor
                    j++;
                    divisors[j]= num1/divisor;//and it's pair
                    j++;
                }
                
            }

            int sum = 0;
            for(int i=0; i<divisors.length; i++)
            {
                if(divisors[i]==0)
                    break;
                else
                    sum += divisors[i];
            }

            if(sum == num2)
                out.println("The numbers are amicable.");
            else
                out.println("The nubmers are not amicable.");
        }
    
}
