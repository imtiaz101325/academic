//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 03: Rectangle 

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob03
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
                out.print("*");
            }
            out.println();
        }
    }
}