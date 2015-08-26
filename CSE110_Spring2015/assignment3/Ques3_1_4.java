//22/3/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//Ques3.1.4: Design and implement an algorithm to iterateively 
//compute the reciprocal of a nubmer

import static java.lang.System.*;
import java.util.*;

public class Ques3_1_4
{
    public static void main (String[] args) 
    {
        Scanner k = new Scanner (in);
        
        out.print("Enter a number: ");
        double num = k.nextDouble();//take a number
        
        double guess = .1;//let's guess the reciprocal to be this
        double guessCheck = .1;
        double temp;//a temporary variable
        double error = .0001;//margin of error for approximation
        
        do
        {
            temp = guess;//stroe our guess in a temporary varriable
            if(temp<0)
            {
                guessCheck /= 10;
                temp = guessCheck;
            }
            guess = (2*temp)-(num*temp*temp);//new guess using
            //newton's method
        }while(Math.abs(guess - temp)>error);//iterate while less that error
        
        out.println("The estimated reciprocal is "+guess);//print the result
        
    }
}