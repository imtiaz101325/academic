//04/04/2015
//Sk. Imtiaz Ahmed
//Lab task for Md. Shamsul Kaonain CSE110
//Task 02: Star Line

import static java.lang.System.*;
import java.util.*;

public class Lab07Prob02
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(in);
    
    out.print("Enter number: ");
    int n = input.nextInt();//input
    
    for(int i=1; i<=n; i++)//star loop
    {
      out.print("*");//output
    }
    out.println();
  }
}