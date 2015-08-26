//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 20: Hollow Triangle - Isosceles

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob20
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight

        /*

        1    *
        2   * *
        3  *   *
        4 *     *
        5*********

        1    *
        2   * -*
        3  *  - *
        4 *   -  *
        5*****-****

        right justifed + left justfied form 2
        
        left part:
        space is (hight-line number)
        and star is just the line number

        right part:
        start form the second line
        limit is line number - 1

        */
        
        for(int i=1; i<=h; i++)//hight loop
        {
            //left part
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            for(int j=1; j<=i; j++)//star loop
            {
                if(j==1)
                    out.print("*");//first position
                else if(i==h)
                    out.print("*");//last line
                else
                    out.print(" ");//hollow
            }

            //right part
            for(int j=2; j<=i; j++)//width loop
            {
                if(j==i)
                    out.print("*");//last position
                else if(i==h)
                    out.print("*");//last line
                else
                    out.print(" ");//hollow
            }
            out.println();
        }
        
    }
}