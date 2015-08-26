//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 18: Hollow Triangle - Right Justified

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob18
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight
        /*

        1234*1
        123**2
        12* *3
        1*  *4
        *****5
        space is (hight-line number)
        and star is just the line number

        */
        
        for(int i=1; i<=h; i++)//hight loop
        {
            for(int j=1; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            for(int j=1; j<=i; j++)//width loop
            {
                if(j==1||j==i )//firs and last position
                    out.print("*");
                else if(i==h)
                    out.print("*");//last line
                else
                    out.print(" ");//hollow space
            }
            out.println();
        }
        
    }
}