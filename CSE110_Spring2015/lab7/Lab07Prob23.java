//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 23: Hollow Numbered Rhombus

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob23
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();

        /*

        1    1
        2   1 3
        3  1   5
        4 1     7
        51       9
        6 1     7
        7  1   5
        8   1 3
        9    1

        1    1
        2   1 -3
        3  1  - 5
        4 1   -  7
        51    -   9

        6 -1     7
        7  -1   5
        8   -1 3
        9    -1

        right justifed + left justfied form 2 + 
        left justified spaces form (hight+1) + (2*hight-3) stars -2 each time
        
        P.S. This Rhombus will not look pretty beyond hight 5

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
            int j=1;//counter used in the next part as well
            for(; j<=i; j++)//width loop
            {
                if(j==1)
                    out.print(j);//first position                
                else
                    out.print(" ");//hollow
            }
            //right part
            //differnent counter form previous number loop
            for(int k=2; k<=i; k++)//number loop
            {
                //counter does not say true to the position
                if(k==i)
                    out.print(j);//last position
                else
                    out.print(" ");//hollow
                j++;
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
                    out.print(k);//counter is true to the position
                else
                    out.print(" ");
            }
            starlimit-=2;//decrement
            out.println();
        }
        
    }
}