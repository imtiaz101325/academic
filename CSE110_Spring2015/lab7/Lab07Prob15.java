//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 04: Hollow Numbered Rectangle

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob15
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        out.print("Enter width: ");
        int w = input.nextInt();//take width
        out.print("Enter width: ");
        int h = input.nextInt();//take hight
        
        for(int i = 1; i<=h; i++)//hight loop
        {
            for(int j=1; j<=w; j++)//width loop
            {
                //counter stays true to the position
                if(i==1||i==h)//first and last line
                    out.print(j);
                else if(j==1||j==w)//first and last position
                    out.print(j);
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}