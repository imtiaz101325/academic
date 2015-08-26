//Sk. Imtiaz Ahmed
//11.3.15 Wednesday
//assignmet 2 for Annajiat Ralsel-CSE110
//How to solve it by computer- R. G. Dromey
//Problem 2.4.3 
//Design an algorithm to determine whether or not a number n is a factorial number

import static java.lang.System.*;
import java.util.*;

public class Prob2_4_3
{

 public static void main(String[] args) 
 {
  Scanner input = new Scanner(in);

  out.printf("Enter a number: ");
  int n = input.nextInt();

  int p = 1;

  for(int c=1; p<=n; c++)
  {
//   out.println("Strill for");

   if(p==n)
   {
    out.printf("%d is %d!", n, c-1);
    break;
   }
   else
    p = p*c;
  }

  if(p>n)
  {
   out.printf("%d is not a fctorial number.");
  }

 }
}