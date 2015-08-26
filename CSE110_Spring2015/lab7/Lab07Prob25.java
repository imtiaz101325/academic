//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 10: Palindrome Triangle - Isosceles

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob25
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight

        /*

        *****1
        ****123
        ***12345
        **1234567
        *123456789

        *****1
        ****12-3
        ***123-45
        **1234-567
        *12345-6789

        P.S. This triangle will not loop pretty for more than 5 lines

        right justifed + left justfied form 2
        
        left part:
        space is (hight-line number)
        and the rest is a loop with line number as limit

        right part:
        form the second line
        prints form line number + 1
        ends at (line number-1)

        */
        
        for(int i=1; i<=h; i++)//hight loop
        {   
            //left part
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            int j=1;//counter used in the next part as well
            for(; j<=i; j++)//number loop
            {
                out.print(j);//counter is true to the position
            }
            //at this point counter is already line number + 1
            j--;//so decrement

            //right part
            //differnent counter form previous number loop
            for(int k=2; k<=i; k++)//number loop
            {
                j--;//decrement as
                out.print(j);//counter does not say true to the position
                
            }
            out.println();
        }
        
    }
}