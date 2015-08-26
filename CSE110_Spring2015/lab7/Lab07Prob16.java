//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 16: Hollow Triangle - Left Justified

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob16
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight
        
        for(int i = 1; i<=h; i++)//hight loop
        {   
            //hight used as limit
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