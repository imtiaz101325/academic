//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 14: Hollow Rectangle 

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter width: ");
        int w = input.nextInt();//take width
        out.print("Enter hight: ");
        int h = input.nextInt();//take hight
        
        for(int i = 1; i<=h; i++)//hight loop
        {
            for(int j=1; j<=w; j++)//width loop
            {
                if(i==1||i==h)//first and last line
                    out.print("*");
                else if(j==1||j==w)//first and last position
                    out.print("*");
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}