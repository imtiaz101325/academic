//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 01: Palindrome Line

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob24
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(in);
    
    out.print("Enter number: ");
    int n = input.nextInt();//input
    
    for(int i=1; i<=n; i++)//forward loop
    {
      out.print(i);//output
    }
    for(int i=n-1; i>0; i--)//backward loop
    {
      out.print(i);//output
    }

    out.println();
  }
}