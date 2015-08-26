//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 12: Numbered Rhombus

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob13
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight

        /*

        1    1
        2   123
        3  12345
        4 1234567
        5123456789
        6 1234567
        7  12345
        8   123
        9    1

        1    1
        2   12-3
        3  123-45
        4 1234-567
        512345-6789

        6 -1234567
        7  -12345
        8   -123
        9    -1

        P.S. This triangle will not look pretty beyond height 5

        right justifed + left justfied form 2 + 
        left justified spaces form (hight+1) +(2*hight-3) stars -2 each time
        

        upper left part:
        space is (hight-line number)
        and star is just the line number

        upper right:
        start form the second line
        limit is line number - 1

        lower part:
        space is a left justifed tiangle
        (2*hight-3) numbers -2 each time


        */
        
        //upper part
        for(int i=1; i<=h; i++)//hight loop
        {
            //left part
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            int j=1;//counter used in the next part as well
            for(; j<=i; j++)//star loop
            {
                out.print(j);//counter is true to the position
            }
            //at this point counter is line number + 1
            //right part
            for(int k=2; k<=i; k++)
            {
                out.print(j);//counter does not stay true to the position
                j++;//thus increment
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
                out.print(k);//counter is true to the position
            }
            starlimit-=2;//decrement
            out.println();
        }
        
    }
}