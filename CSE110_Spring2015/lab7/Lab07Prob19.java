//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 19: Hollow Numbered Triangle - Right Justified

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob19
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight

        /*

        ****5
        ***45
        **3 5
        *2  5
        12345

        P.S. This triangle will not look pretty after over hight 10

        space is (hight-line number)
        and the rest is a loop with line number as limit
        prints form space counter + 1


        */
        
        for(int i=1; i<=h; i++)//hight loop
        {
            int j=1;//counter will be used int the next step
            for(; j<=h-i; j++)//space loop
            {
                out.print(" ");
            }
            //at this point counter is already space counter + 1

            for(int k=1; k<=i; k++)//width loop
            {
                if(k==1||k==i )//firs and last position
                    out.print(j);
                else if(i==h)
                    out.print(j);//last line
                else
                    out.print(" ");//hollow space//counter does not stay true to the positon
                j++;//thus increment
            }
            out.println();
        }
        
    }
}