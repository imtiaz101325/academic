//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 12: Hollow Rhombus

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob22
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();

        /*

        1    *
        2   * *
        3  *   *
        4 *     *
        5*       *
        6 *     *
        7  *   *
        8   * *
        9    *

        1    *
        2   * -*
        3  *  - *
        4 *   -  *
        5*    -   *

        6 -*     *
        7  -*   *
        8   -* *
        9    -*

        right justifed + left justfied form 2 + 
        left justified spaces form (hight+1) + (2*hight-3) stars -2 each time
        

        upper left part:
        space is (hight-line number)
        and star is just the line number

        upper right:
        start form the second line
        limit is line number - 1

        lower part:
        space is a left justifed tiangle
        (2*hight-3) stars -2 each time


        */
        
        //upper part
        for(int i=1; i<=h; i++)//hight loop
        {
            //left part
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            for(int j=1; j<=i; j++)//width loop
            {
                if(j==1)
                    out.print("*");//first position                
                else
                    out.print(" ");//hollow
            }
            //right part
            for(int j=2; j<=i; j++)
            {
                if(j==i)
                    out.print("*");//last position
                else
                    out.print(" ");//hollow
            }
            out.println();
        }
        
        //lower part
        int starlimit = (2*h)-3;//star limit
        for(int i=1; i<=h-1; i++)//hight loop
        {
            //space loop
            for(int j=1; j<=i; j++)
            {
                out.print(" ");
            }
            //star loop
            for(int k=1; k<=starlimit; k++)
            {
                if(k==1||k==starlimit)//first and last position
                    out.print("*");
                else
                    out.print(" ");
            }
            starlimit-=2;//decrement
            out.println();
        }
        
    }
}