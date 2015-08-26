//17/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//3.1.2: Develop an algorithm to input n numbers and compute their geometric mean

import static java.lang.System.*;
import java.util.*;

public class Ques3_1_2test
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter how many numbers: ");
        double num = k.nextDouble();//fist establish how many numbers to compute
        double product = 1;//this is where the numbers will be multiplied 
        //iteratively
        
        for(int i=1; i<=num; i++)//iterates n times
        {
            out.print("Enter next number: ");
            product *= k.nextDouble();//multipying each number to p
        }
        
        double guess = product/num;//let's guess the nth root of p is this
        double temp;//a temporary variable
        double error = .001;//margin of error for approximation
        
        do
        {
            temp = guess;//stroe our guess in a temporary varriable
            guess = (((num-1)*temp)+(product/((num-1)*temp)))/num;//new guess using
            //newton's method
        }while(Math.abs(guess - temp)>error);//iterate while less that error
        
        out.println("The extimated geometric mean is "+guess);//print the result
        
    }
}