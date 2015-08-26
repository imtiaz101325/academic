//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 08: Numbered Triangle - Right Justified

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight

        /*

        ****1
        ***12
        **123
        *1234
        12345

        so space is (hight-line number)
        and the rest is a loop with line number as limit

        */
        
        for(int i=1; i<=h; i++)//hight loop
        {
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            for(int j=1; j<=i; j++)//number loop
            {
                out.print(j);//counter is true to to position
            }
            out.println();
        }
        
    }
}